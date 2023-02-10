package oops_btech;

public class String_immute {
	
	 public static void main(String args[]){  
		   String s="MAKAUT";  
		   String s1=s.concat(" or WBUT");//concat() method appends the string at the end  
		   int s1_length = s1.length();
		   System.out.println(s1);
		   System.out.println("String Length = "+ s1_length);
		   
		   s=s.concat(" Haringhata, West Bengal");  
		   System.out.println(s); 
		   int s_length = s.length();
		   System.out.println("String Length = "+ s_length);
		 }  
} 

