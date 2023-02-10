/**
 * parameterized constructor
 */
package oops_btech;

public class parameterizedconstructor {

	 int id;  
	    String name;  
	    //creating a parameterized constructor  
	    parameterizedconstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	parameterizedconstructor s1 = new parameterizedconstructor(111,"Karan");  
	    	parameterizedconstructor s2 = new parameterizedconstructor(222,"Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  

}
