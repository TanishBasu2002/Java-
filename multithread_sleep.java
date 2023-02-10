package oops_btech;
//Java program for sleep() method
class SleepThread extends Thread  {    
    //run method for thread
    public void run()    {    
        for(int i=1;i<5;i++)   {    
            try  {  
                //call sleep method of thread
                Thread.sleep(1000);  
            }catch(InterruptedException e){System.out.println(e);}    
            //print current thread instance with loop variable
            System.out.println(Thread.currentThread().getName() + "   : " + i);    
        }    
    }    
}
class multithread_sleep{
    public static void main(String args[])  
    {  
        //create two thread instances
        SleepThread thread_1 = new SleepThread();    
        SleepThread thread_2 = new SleepThread();    
        //start threads one by one
        thread_1.start();    
        thread_2.start();    
    }    
} 