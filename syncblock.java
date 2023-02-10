package oops_btech;
//synchronized block
class Table3{  
	  
	 void printTable(int n){  
	   synchronized(this){//synchronized block  
	     for(int i=1;i<=5;i++){  
	      System.out.println(n*i);  
	      try{  
	       Thread.sleep(400);  
	      }catch(Exception e){System.out.println(e);}  
	     }  
	   }  
	 }//end of the method  
	}  
	  
	class Thread_1 extends Thread{  
	Table3 t;  
	Thread_1(Table3 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	} 
	} 
	
	class Thread_2 extends Thread{  
	Table3 t;  
	Thread_2(Table3 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	  
	public class syncblock{  
	public static void main(String args[]){  
	Table3 obj = new Table3();//only one object  
	Thread_1 t1=new Thread_1(obj);  
	Thread_2 t2=new Thread_2(obj);  
	t1.start();  
	t2.start();  
	}  
	}  