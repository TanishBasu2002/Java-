package oops_btech;

 import java.util.Scanner;

/**
* An example program to read a String from console input in Java
*/
 public class string_keyboard {

   public static void main(String[] args) {
       System.out.print("Enter a string : ");
       @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System. in);
       String inputString = scanner. nextLine();
       System.out.println("String read from console is : \n"+inputString);
   }
} 