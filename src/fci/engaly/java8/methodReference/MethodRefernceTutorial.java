package fci.engaly.java8.methodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodRefernceTutorial {

	public <T> T test(Function<Details, T> resolver) {
		return resolver.apply(getDetails());
	}

	private Details getDetails() {
		Details d = Details.getInstance();
		d.setId(1);
		d.setName("aly ahmed");
		return d;
	}

	public String getName() {
		return test(Details::getName);
	}

	public static void main(String[] args) {
		MethodRefernceTutorial c = new MethodRefernceTutorial();
		System.out.println(c.getName());

		/**
		 * functional interface using anonymous class
		 */
		Name<Details, String, String> name = new Name<Details, String, String>() {
			@Override
			public String applay(Details d, String s) {
				return d.hello(s);
			}
		};
		System.out.println(name.applay(new Details(), "hello functional interface"));

		/**
		 * same upper example but using functional interface using lambda expression
		 */
		Name<Emps, Integer, Integer> emp = (t, i) -> t.getEmpId(i);
		System.out.println(emp.applay(new Emps(), 10));

//		convert set to list
		Name<Emps, Set<Integer>, List> names = (e, s) ->s.stream().collect(Collectors.toList());
		Set<Integer> set=new HashSet<Integer>();
		set.add(11);
		set.add(12);
		set.add(13);
		
		System.out.println(names.applay(null, set));
			 
//		call static method using functional interface
		Function<Integer, Integer> emps = Emps::getId;
		System.out.println(emps.apply(10));
	}

}

@FunctionalInterface
interface Name<T, I, R> {
	R applay(T t, I i);
}

class Emps {
	public static int getId(int s) {
		return s * 3;
	}

	public int getEmpId(int s) {
		return s * 2;
	}

	public int foo() {
		return 100;
	}

	private <T> T getAll(Function<Emps, T> resolver) {
		return resolver.apply(new Emps());

	}

	public int getFoo() {
		return getAll(Emps::foo);
	}

}

class Details {

	private int id;
	private String name;
	private static Details demo;

	public String hello(String s) {
		return s;
	}

	public static Details getInstance() {
		if (demo != null) {
			return demo = new Details();
		}
		return new Details();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}