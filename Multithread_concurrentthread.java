package oops_btech;
/* Creating three threads using the class Thread 
 * and then running them concurrently. */
class Java extends Thread{
     public void run( ) {
        for(int i = 1; i <= 5; i++) {
           System.out.println("From Java with i = "+ 1*i);
        }
        System.out.println("Exiting from Java ...");
     }
}

class Python extends Thread {
    public void run( ) {
       for(int j = 1; j <= 5; j++) {
         System.out.println("From Python with j= "+2* j);
       }
       System.out.println("Exiting from Python ...");  
	}
}

class C extends Thread{
     public void run( ) {
         for(int k = 1; k <= 5; k++) {
             System.out.println("From C with k = "+ (2*k-1));
         }
         System.out.println("Exiting from C ...");
     }
}

public class Multithread_concurrentthread {
    public static void main(String args[]) {
    	Java a = new Java();
    	Python b = new Python();
         C c = new C();
         a.start();
         b.start();
         c.start();
         System.out.println("... Multithreading is over ");
    }
}

