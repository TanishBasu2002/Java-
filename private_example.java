package oops_btech;


class A1{  
		private int data=40;  
		private void msg(){System.out.println("Hello java");}  
}  

  
public class private_example{  
 public static void main(String args[]){  
   @SuppressWarnings("unused")
A1 obj=new A1();  
// System.out.println(obj.data);//Compile Time Error  
// obj.msg();//Compile Time Error  
 }  
}  