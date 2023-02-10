package oops_btech;

//Java program to illustrate isAlive() 

public class multithreaded_isalive extends Thread { 
	public void run() 
	{ 
		System.out.println("JAVA "); 
		 
		System.out.println("Python "); 
	} 
	public static void main(String[] args) 
	{ 
		multithreaded_isalive c1 = new multithreaded_isalive(); 
		multithreaded_isalive c2 = new multithreaded_isalive(); 
		System.out.println("before starting thread isAlive: "+c1.isAlive());
		System.out.println("before starting thread isAlive: "+c2.isAlive());
		
		c1.start(); 
		c2.start(); 
		
		System.out.println("After starting thread isAlive: "+c1.isAlive()); 
		System.out.println("After starting thread isAlive: "+c2.isAlive()); 
	} 
} 

