package oops_btech;


//Employee class with empId and name as attributes
class Employee1
{
	    int empId;
	    String name;
	    public void assignData(int c,String d)
	    {
	    	//System.out.println("step 1:");
	        empId=c;
	        name=d;
	     }
	    public void showData()
	    {
	    	//System.out.println("step 2:");
	        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
	        System.out.println();
	     }
}
	
public class array_objects 
{
	public static void main(String args[])
	{
		//System.out.println("step 0:");
	     //create array of employee object
		Employee1[] obj = new Employee1[2] ;
	    //create actual employee object
	     obj[0] = new Employee1();
	     obj[1] = new Employee1();
	    // System.out.println("step 0.1:");
	   //assign data to employee objects
	     obj[0].assignData(100,"ABC");
	     //System.out.println("step 0.2:");
	     obj[1].assignData(200,"XYZ");
	     
	  //display the employee object data
	     System.out.println("Employee Object 1:");
	     obj[0].showData();
	     System.out.println("Employee Object 2:");
	     obj[1].showData();
	  }
	}
	