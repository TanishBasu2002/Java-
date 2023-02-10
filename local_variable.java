package oops_btech;

public class local_variable {

	int year= 2022;
	public void StudentAge() 
    { 
        // local variable age 
        int age = 20; 
        age = age + 5; 
        System.out.println("Student age is : " + age); 
    }
	
	public static void main(String args[]){
		local_variable Loc = new local_variable();
		
		Loc.StudentAge();
	//	System.out.println(Loc.age);
		System.out.println("In the year : " + Loc.year);
		
}
}
