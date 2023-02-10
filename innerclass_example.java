/**
 * 
 */
package oops_btech;

// this is an outer class
	class Outer{
		int outer_x = 100;
		void test() {
			Inner inner = new Inner();
			inner.display();
		     }
		
		//this is an inner class 
		class Inner{
				void display() {
				System.out.println("Display: outer_x = " + outer_x);  
			     }
				}
		}

		public class innerclass_example { 
	public static void main(String[] args) {
	Outer outer = new Outer();
	outer.test();
	}
}
