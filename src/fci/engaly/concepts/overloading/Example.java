package fci.engaly.concepts.overloading;

public class Example {
	public void add(String name) { // String parameter
	}

	public static void main(String args[]) {
		Example addition = new Sub();    // Note: Polymorphism is not applicable for method overloading.
//		addition.add();    // compile error
	}
}

class Sub extends Example {

	void add() {// No Parameter
		System.out.println("add without param");
	}

	void add(int a) { // integer parameter
		System.out.println("add with int param");
	}
}