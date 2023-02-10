package oops_btech;

//example of java synchronized method  
class Table1{  
synchronized void printTable(int n){//synchronized method  
 for(int i=1;i<=5;i++){  
   System.out.println(n*i);  
   }  
}  
}  

class MyThread_1 extends Thread{  
Table1 t;  
MyThread_1(Table1 t){  
this.t=t;  
}  
public void run(){  
System.out.println("Thread_1");
t.printTable(5);  
}  

}  
class MyThread_2 extends Thread{  
Table1 t;  
MyThread_2(Table1 t){  
this.t=t;  
}  
public void run(){  
System.out.println("Thread_2");
t.printTable(100);  
}  
}  

public class sync_method{  
public static void main(String args[]){  
Table1 obj = new Table1();
MyThread_1 t1=new MyThread_1(obj);  
MyThread_2 t2=new MyThread_2(obj);  
t1.start();  
t2.start();  
}  
}