package oops_btech;

public class string_object {

	   public static void main(String args[])
	   {  
		//creating a string by java string literal 
		String str = "Program"; 
		
		char arrch[]={'J','a','v','a'}; 
		//converting char array arrch[] to string str2
		String str2 = new String(arrch); 
			
		//creating another java string str3 by using new keyword 
		String str3 = new String("String Example"); 
			
		//Displaying all the three strings
		System.out.println(str);  
		System.out.println(str2);  
		System.out.println(str3);  
	   }
}