package oops_btech;

//changing data type of arguments
public class method_overloading {
	static int add(int a, int b){return a+b;}  
	static int add(int a, int b, int c){return a+b+c;}  

public static void main(String[] args){ 
	
System.out.println(method_overloading.add(11,11));  
System.out.println(method_overloading.add(12,12, 16));  
}
}