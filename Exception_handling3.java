package oops_btech;
//Demonstrate multiple catch statements.

public class Exception_handling3 {
	public static void main(String args[]) {
	try {
		int a = 10;//11;
		System.out.println("a = " + a);
		int b = 42 / a;
		int c[] = { 1 };
		c[10] = 99;
		} 
	catch(ArithmeticException e) {
		System.out.println("Divide by 0: " + e);
		} 
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index: " + e);
		}
	    System.out.println("After try/catch blocks.");
		}
	}

