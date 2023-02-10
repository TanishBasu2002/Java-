package oops_btech;
//sync block
class First_syncblock
{
  public void display(String msg)
  {
    System.out.print ("["+msg);
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println ("]");
  }
}

class Second_syncblock extends Thread
{
  String msg;
  First_syncblock fobj;
  Second_syncblock(First_syncblock fp,String str)
  {
    fobj = fp;
    msg = str;
    start();
  }
  public void run()
  {
    synchronized(fobj)      //Synchronized block
    {
      fobj.display(msg);
    }
  }
}

public class multithread_syncblock
{
  public static void main (String[] args)
  {
    First_syncblock fnew = new First_syncblock();
    Second_syncblock ss = new Second_syncblock(fnew, "welcome");
    Second_syncblock ss1= new Second_syncblock (fnew,"new");
    Second_syncblock ss2 = new Second_syncblock(fnew, "programmer");
  }
}
  
