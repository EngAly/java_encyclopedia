package fci.engaly.concepts.exceptions;

/**
 * types of exceptions<br>
 * Checked Exception: These exceptions are checked by the compiler at the time
 * of compilation. Classes that extend Throwable class except Runtime exception
 * and Error are called checked Exception. Checked Exceptions must either
 * declare the exception using throes keyword (or) surrounded by appropriate
 * try/catch. ClassNotFound Exception
 *
 * Unchecked Exception: These exceptions are not checked during the compile time
 * by the compiler. The compiler doesn’t force to handle these exceptions. It
 * includes: Arithmetic Exception ArrayIndexOutOfBounds Exception
 */
public class TestExceptions {

	public static void main(String[] args) {
		try {
//			risky code
			System.out.println(2 / 0);
//			maybe catch is absent
		} catch (Exception e) {
//			Exceptions are caught here.
		} finally {
//			  This is followed either by try block (or) catch block.
//		   	This block gets executed regardless of an exception. So generally clean up codes 
//			are provided here.
			System.out.println("finally");
		}
	}

}
