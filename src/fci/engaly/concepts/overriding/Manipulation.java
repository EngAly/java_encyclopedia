package fci.engaly.concepts.overriding;

public class Manipulation { // Super class
	public void add() {
		System.out.println("parent");
	}

	public static void main(String args[]) {
		Manipulation addition = new Addition(); // is applied
		addition.add(); // It calls the Sub class add() method
	}
}

class Addition extends Manipulation {
	public void add() {
		System.out.println("child");
	}
}