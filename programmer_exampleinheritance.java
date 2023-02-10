/**
 * Example of inheritance
 */
package oops_btech;

class Employee{  
 float salary=40000;  
}  

public class programmer_exampleinheritance extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
		 programmer_exampleinheritance p=new programmer_exampleinheritance();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
}
