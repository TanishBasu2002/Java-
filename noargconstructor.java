/**
 * Example of no-arg constructor
 */
package oops_btech;

public class noargconstructor {

	int i;

	   // constructor with no parameter
	   private noargconstructor(){
	       i = 5;
	       System.out.println("Object created and i = " + i);
	   }

	   @SuppressWarnings("unused")
	public static void main(String[] args) {

	       // calling the constructor without any parameter
		   noargconstructor obj = new noargconstructor();
	   }

}
