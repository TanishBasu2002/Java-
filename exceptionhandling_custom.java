package oops_btech;
//example of Custom Exception
//A Class that represents use-defined expception 
class MyException extends Exception 
{ 
 public MyException(String s) 
 { 
     // Call constructor of parent Exception 
	 
     super(s); 
 } 
} 

//A Class that uses above MyException 
public class exceptionhandling_custom 
{ 
 // Driver Program 
 public static void main(String args[]) 
 { 
     try
     { 
         // Throw an object of user defined exception 
         throw new MyException("throw user deifned exception"); 
     } 
     catch (MyException ex) 
     { 
         System.out.println("Caught"); 

         // Print the message from MyException object 
         System.out.println(ex.getMessage()); 
     } 
 } 
} 
