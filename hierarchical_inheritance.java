/**hierarchical inheritance in Java**/
package oops_btech;

class Shape
{
  int  i;
  Shape()
  {
     i=5;
  }
}

class square extends Shape
{
    int  j;
    square()
   {
     j=5;
   }
}

class rectangle extends Shape
{
   int k;
   rectangle()
   {
      k=7;
   }
}

class hierarchical_inheritance
{
  public static void main(String args[])
{
	Shape a=new Shape();   
    square b=new square();   
    rectangle c=new rectangle();   
    System.out.println(a.i); 
    System.out.println(b.i*b.j);
    System.out.println(c.i+c.k);
}
}
