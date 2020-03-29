package fci.engaly.java8.stream;

import java.util.stream.Stream;

public class StreamTutorial {

	public static void main(String[] args) {
		Stream<Integer> stream=Stream.of(1,2,3,4,5,6,7);
//		stream.forEach(n -> System.out.println(n));
		
//		this is called Method Reference or Double Colon Operator
		stream.forEach(System.out::println);
	}

}
