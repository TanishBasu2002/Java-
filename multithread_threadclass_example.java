package oops_btech;

/* Creating one threads using the class Thread and 
 * then running it. */
class ThreadA1 extends Thread{
     public void run( ) {
        for(int i = 1; i <= 5; i++) {
           System.out.println("From Thread A1 with i = "+ -1*i);
        }
        System.out.println("Exiting from Thread A1 ...");
     }
}

public class multithread_threadclass_example {
    public static void main(String args[]) {
         ThreadA1 a = new ThreadA1();
         a.start();
             }
}
