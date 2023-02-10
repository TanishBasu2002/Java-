/**
 * without using copy constructor to copy 
 * values from one object to another object.
 */
package oops_btech;

public class nocopy_constructor {

	/**
	 * @param args
	 */
	 int id;  
	    String name;  
	  //constructor to initialize integer and string
	    nocopy_constructor(int i,String n){  
	    id = i;  
	    name = n;  
	    } 
	    
	    nocopy_constructor(){}  
	    
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	nocopy_constructor s1 = new nocopy_constructor(111,"person2");  
	    	nocopy_constructor s2 = new nocopy_constructor();  
	    s2.id=s1.id;  
	    s2.name=s1.name;  
	    s1.display();  
	    s2.display();  
	   }  
}


