package oops_btech;

/* Creating one threads using the Runnable interface and 
 * then running it. */

class multithread_runnable implements Runnable{
	   public void run(){
	      System.out.println("Thread is running for Runnable Implementation");
	   }
	   public static void main(String args[]){
		  multithread_runnable runnable=new multithread_runnable();
	      Thread t1 =new Thread(runnable);
	      t1.start();
	   }
	}
