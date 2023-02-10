/**
 * Accessing the variable of parent class:
 */
package oops_btech;

class Superclass
{
   int num = 100;
}

class super_use extends Superclass
{
   int num = 110;
   void printNumber(){
	/* Note that instead of writing num we are
	 * writing super.num in the print statement
	 * this refers to the num variable of Superclass
	 */
	System.out.println(super.num);
	System.out.println(num);
   }
   public static void main(String args[]){
	   super_use obj= new super_use();
	obj.printNumber();	
   }
}