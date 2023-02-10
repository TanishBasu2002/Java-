/** Using ‘this’ keyword to refer current class instance variables */
package oops_btech;

public class example_this {

		int variable = 5;
		public static void main(String args[]) {
			example_this obj = new example_this();
			obj.method(20);
			obj.method();
		}

		void method(int variable) {
			variable = 10;
			System.out.println("Value of Instance variable :" + this.variable);
			System.out.println("Value of Local variable :" + variable);
		}

		void method() {
			int variable = 40;
			System.out.println("Value of Instance variable :" + this.variable);
			System.out.println("Value of Local variable :" + variable);
		}
	}