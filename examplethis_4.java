/**
 * this: to invoke current class method
 */
package oops_btech;

public class examplethis_4 {
	
	void m(){
		System.out.println("hello m");
		}  
	
	void n(){  
	System.out.println("hello n");  
	//m();//same as this.m()  
	this.m();  
	}  
		
	public static void main(String args[])
	{  
		examplethis_4 a=new examplethis_4();  
	    a.n();  
	}
	
}
