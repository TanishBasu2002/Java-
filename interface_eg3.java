package oops_btech;

interface Inf1{
   public void method1();
}

interface Inf2 extends Inf1 {
   public void method2();
}

public class interface_eg3 implements Inf2{
   /* Even though this class is only implementing the
    * interface Inf2, it has to implement all the methods 
    * of Inf1 as well because the interface Inf2 extends Inf1
    */
    public void method1(){
	System.out.println("method1");
    }
    public void method2(){
	System.out.println("method2");
    }
    public static void main(String args[]){
    	interface_eg3 obj = new interface_eg3();
    	interface_eg3 obj1 = new interface_eg3();
	obj.method2();
	obj1.method1();
    }
}