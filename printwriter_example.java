package oops_btech;
//Demonstrate PrintWriter
import java.io.*;
public class printwriter_example {
	public static void main(String args[]) {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("This is a string");
		int i = -7;
		pw.println(i);
		double d = 4.5e-7;
		pw.println(d);
		}
}
