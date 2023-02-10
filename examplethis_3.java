/** Using this() to invoke current class constructor */
package oops_btech;

public class examplethis_3 {
     //constructor 
	examplethis_3(){
		System.out.println("hello world");
		} 
	
	examplethis_3(int x){  
	this();  
	System.out.println(x);  
	}  
 
	
	public static void main(String args[])
	{  
		examplethis_3 a=new examplethis_3(10);  
	}
}
