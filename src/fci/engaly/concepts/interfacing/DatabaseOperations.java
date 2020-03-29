package fci.engaly.concepts.interfacing;

/**
 * Why interface:- Multiple inheritance cannot be achieved in java. To overcome
 * this problem Interface concept is introduced. An interface is a template
 * which has only method declarations and not the method implementation.<br />
 * notes:- <br />
 * 1) public abstract void.<br />
 * 2) All the variables in the interface are internally public static final that
 * is constants.<br />
 * 3) Classes can implement the interface and not extends.
 * 
 * Doesn’t have any constructor and couldn’t be instantiated. Abstract method
 * alone should be declared. Classes which implement the interface should
 * provide the implementation for all the methods. The interface contains only
 * constants.
 */
public interface DatabaseOperations {

	public void insert();

	public void create();

	public void update();

	public void delete();
}
