/**
 * //Java program to copy 
 * the values from one object to another object.  
 */
package oops_btech;


public class copy_constructor2 {
	    int id;  
	    String name;
	    
	    //constructor to initialize integer and string  
	    copy_constructor2(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    
	    //constructor to initialize another object  
	    copy_constructor2(copy_constructor2 s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    }  
	   
	    public static void main(String args[]){  
	    	copy_constructor2 s1 = new copy_constructor2(111,"person1");  
	    	copy_constructor2 s2 = new copy_constructor2(s1);  
	    s1.display();  
	    s2.display();  
	   }  
}
