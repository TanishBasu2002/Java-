package oops_btech;

public class arrayobjects_constructor {
public static void main(String args[]){
    //create array of employee object  
   Employee2[] obj = new Employee2[2] ;

    //create & initialize actual employee objects using constructor
    obj[0] = new Employee2(100,"ABC_1");
    obj[1] = new Employee2(200,"XYZ_2");

    //display the employee object data
    System.out.println("Employee Object 1:");
    obj[0].showData();
    System.out.println("Employee Object 2:");
    obj[1].showData();
 }
}

//Employee class with empId and name as attributes
class Employee2{
int empId;
String name;
//Employee class constructor
Employee2(int eid, String n){
   empId = eid;
   name = n;
}
public void showData(){
 System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
 System.out.println();
}
}
