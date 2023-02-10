
package oops_btech;
//Handle an exception and move on.
import java.util.Random;
public class Exception_handling2 {
	public static void main(String args[]) {
		int a=0, b=0, c=0;
		Random r = new Random();
		for(int i=0; i<5; i++) 
		{
			try {
					b = r.nextInt();
					System.out.println("b: " + b);
					c = r.nextInt();
					System.out.println("c: " + c);
					a = 12 / (b/c);
					} 
			catch (ArithmeticException e) {
				System.out.println("Division by zero.");
				a = 0; // set a to zero and continue
				}
		System.out.println("a: " + a);
		}
		}
}

