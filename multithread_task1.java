package oops_btech;
//Using suspend() and resume(), stop() 

class NewThread1 implements Runnable
{
    String name;      //name of thread
    Thread thr;
    boolean suspendFlag;
    
    NewThread1(String threadname)
    {
        name = threadname;
        thr = new Thread(this, name);
        System.out.println("New thread : " + thr);
        suspendFlag = false;
        thr.start();     // start the thread
    }
    
    /* this is the entry point for thread */
    public void run()
    {
        try
        {
            for(int i=12; i>0; i--)
            {
                System.out.println(name + " : " + i);
                Thread.sleep(200);
                synchronized(this)
                {
                    while(suspendFlag)
                    {
                        wait();
                    }
                }
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(name + " interrupted");
        }
        
        System.out.println(name + " exiting...");
    }
    
    synchronized void mysuspend()
    {
        suspendFlag = true;
    }
    
    synchronized void myresume()
    {
        suspendFlag = false;
        notify();
    }
}

class multithread_task1
{
    public static void main(String args[])
    {
        
        NewThread1 obj1 = new NewThread1("One");
        NewThread1 obj2 = new NewThread1("two");
        
        try
        {
            Thread.sleep(1000);
            obj1.mysuspend();
            System.out.println("Suspending thread One...");
            Thread.sleep(1000);
            obj1.myresume();
            System.out.println("Resuming thread One...");
            
            obj2.mysuspend();
            System.out.println("Suspending thread Two...");
            Thread.sleep(1000);
            obj2.myresume();
            System.out.println("Resuming thread Two...");
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread Interrupted..!!");
        }
        
        /* wait for threads to finish */
        try
        {
            System.out.println("Waiting for threads to finish...");
            obj1.thr.join();
            obj2.thr.join();
        }
        catch(InterruptedException e)
        {
            System.out.println("Main thread Interrupted..!!");
        }
        
        System.out.println("Main thread exiting...");
        
    }
}

