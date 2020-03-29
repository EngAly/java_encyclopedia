package fci.engaly.concepts.abstracting;

/**
 * We can create the Abstract class by using “Abstract” keyword before the class
 * name. An abstract class can have both “Abstract” methods and “Non-abstract”
 * methods that are a concrete class.<br>
 * if there method abstract must class to be abstract<br>
 * An abstract class may have a Non- abstract method also.
 */
public abstract class Student {

	/**
	 * The method which has only the declaration and not the implementation is
	 * called the abstract method and it has the keyword called “abstract”.
	 * Declarations are the ends with a semicolon.
	 */
	public void collage() {
		System.out.println("Suze Canal");
	};

	// Abstract method declaration
	public abstract void studentName();

}
