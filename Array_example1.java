package oops_btech;
//Demonstrate a one-dimensional array.

public class Array_example1 {

public static void main(String args[]) {
//int month_days[] = {2,3,5,6};//array declaration
//int month_days[] = new int[12];
int [] month_days = new int[12];//declaration and instantiation  
month_days[0] = 31;
month_days[1] = 28;
month_days[2] = 31;
month_days[3] = 30;
month_days[4] = 31;
//month_days[5] = 30;
//month_days[6] = 31;
//month_days[7] = 31;
//month_days[8] = 30;
//month_days[9] = 31;
//month_days[10] = 30;
System.out.println("April has " + month_days[3] + " days.");
//@SuppressWarnings("unused")
int aSize = month_days.length;   //Array Length
System.out.println("Array Length " + aSize);

}
}