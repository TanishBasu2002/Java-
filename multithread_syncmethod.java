package oops_btech;
//synch method
class First_sync
{
  synchronized public void display(String msg)
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

class Second_sync extends Thread
{
  String msg;
  First_sync fobj;
  Second_sync (First_sync fp,String str)
  {
    fobj = fp;
    msg = str;
    start();
  }
  public void run()
  {
    fobj.display(msg);
  }
}

public class multithread_syncmethod
{
  @SuppressWarnings("unused")
public static void main (String[] args)
  {
	  First_sync fnew = new First_sync();
    Second_sync ss = new Second_sync(fnew, "welcome");
    Second_sync ss1= new Second_sync(fnew,"new");
    Second_sync ss2 = new Second_sync(fnew, "programmer");
  }
}