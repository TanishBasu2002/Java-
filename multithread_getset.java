package oops_btech;
//Java program to demonstrate getPriority() and setPriority()

class multithread_getset extends Thread 
{ 
    public void run() 
    { 
        System.out.println("Inside run method"); 
    } 
  
    public static void main(String[]args) 
    { 
    	multithread_getset t1 = new multithread_getset(); 
    	multithread_getset t2 = new multithread_getset(); 
    	multithread_getset t3 = new multithread_getset(); 
  
        System.out.println("thread1 thread priority : " + 
                              t1.getPriority()); // Default 5 
        System.out.println("thread2 thread priority : " + 
                              t2.getPriority()); // Default 5 
        System.out.println("thread3 thread priority : " + 
                              t3.getPriority()); // Default 5 
  
        t1.setPriority(3); 
        t2.setPriority(5); 
        t3.setPriority(8); 
  
        // t3.setPriority(); will throw IllegalArgumentException 
        System.out.println("thread1 thread priority : " + 
                              t1.getPriority());  //2 
        System.out.println("thread2 thread priority : " + 
                              t2.getPriority()); //5 
        System.out.println("thread3 thread priority : " + 
                              t3.getPriority());//8 
  
        // Main thread 
        //System.out.print(Thread.currentThread().getName()); 
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority()); 
  
        // Main thread priority is set to 10 
        Thread.currentThread().setPriority(10); 
        System.out.println("Main thread priority : "
                       + Thread.currentThread().getPriority()); 
    } 
} 

