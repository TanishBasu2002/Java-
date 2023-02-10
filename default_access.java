package oops_btech;
import oops_btech1.*;
public class default_access {
	
		   public static void main(String args[]){
			   calculator obj = new calculator();
		        /* It will throw error because we are trying to access
		         * the default method in another package
		         */
			obj.add(10, 21);
		   }

}
