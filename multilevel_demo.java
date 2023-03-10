/**multilevel inheritance in Java**/
package oops_btech;

class X
{
  int  i;
   X()
  {
     i=5;
  }
}

class Y extends X
{
    int  j;
    Y()
   {
     j=6;
   }
}

class Z extends Y
{
   int k;
   Z()
   {
      k=7;
   }
}

class multilevel_demo
{
  public static void main(String args[])
{
    X a=new X();   // class X consist one variable i
    Y b=new Y();   // class Y consist variables j, i(it came from parent class X)
    Z c=new Z();   //class Z consist variables k,j(class y), i(class X)
    System.out.println(a.i); // a-->i=5
    System.out.println(b.i+b.j);// b--->i=5,j=6
    System.out.println(c.i+c.k);// c-->i=5,j=6,k=7
    System.out.println(c.i+c.j+c.k);// c-->i=5,j=6,k=7
}
}
