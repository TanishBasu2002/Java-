/**
 * Using ‘this’ keyword to refer current class instance variables
 */
package oops_btech;

public class examplethis_2 {

	int rollno;  
	String name;  
	float fee; 
	
	examplethis_2(int rollno,String name,float fee)
	{  
	this.rollno=rollno;  
	this.name=name;  
	this.fee=fee;  
	}
	void display(){System.out.println(rollno+" "+name+" "+fee);}  
 
	  
	public static void main(String args[])
	{  
		examplethis_2 s1=new examplethis_2(111,"s1",5000f);  
		examplethis_2 s2=new examplethis_2(112,"s2",6000f);  
	s1.display();  
	s2.display(); 
	}
}
