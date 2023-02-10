/**
 *  super keyword to invoke constructor of parent class
 */
package oops_btech;

class Parentclass1
{
   Parentclass1(){
	System.out.println("Constructor of parent class");
   }
}

class super_constructor extends Parentclass1
{
	super_constructor(){
	/* Compiler implicitly adds super() here as the
	 *  first statement of this constructor.*/
	super();
	System.out.println("Constructor of child class");
   }
	super_constructor(int num){
	/* Even though it is a parameterized constructor.
	 * The compiler still adds the no-arg super() here
	 */
	super();
	System.out.println("arg constructor of child class");
   }
   void display(){
	System.out.println("Hello!");
   }
   
   public static void main(String args[]){
	/* Creating object using default constructor. This 
	 * will invoke child class constructor, which will 
	 * invoke parent class constructor
	 */
	  super_constructor obj= new super_constructor();
	//Calling sub class method 
	obj.display();
	/* Creating second object using arg constructor
	 * it will invoke arg constructor of child class which will
	 * invoke no-arg constructor of parent class automatically 
	 */
	super_constructor obj2= new super_constructor(10);
	obj2.display();
   }
}