/**
 *  use super keyword in case of method overriding:
 */
package oops_btech;

class Parentclass
{
   //Overridden method
   void display(){
	System.out.println("Parent class method");
   }
}
class Subclass extends Parentclass
{
   //Overriding method
   void display(){
	System.out.println("Child class method");
   }
   void printMsg(){
	//This would call Overriding method
	display();
	//This would call Overridden method
	super.display();
   }
}

class super_methodoverride
{
   public static void main(String args[]){		
	Subclass obj= new Subclass();
	obj.printMsg(); 
   }
}