package oops_btech;

//super class
class one 
{ 
    public void print_1() 
    { 
        System.out.println("CSE "); 
    } 
} 
  
//subclass
class two extends one 
{ 
    public void print_for() 
    { 
        System.out.println("NIT SIKKIM"); 
    } 
} 
// Driver class 
public class single_inheritance {
	public static void main(String[] args) 
    { 
        two g = new two(); 
        //g.print_1(); 
        g.print_for(); 
        g.print_1(); 
    } 
}
