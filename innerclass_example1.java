/**
 * 
 */
package oops_btech;

// this is an outer class
	class Outer1{
		int outer_x1 = 50;
		
		
		void test() {
			Inner1 inner1 = new Inner1();
			inner1.display();
		     }
		
		//this is an inner class 
		class Inner1{
			int y = 10; // y is local to Inner
			void display() {
				System.out.println("Display: outer_x = " + outer_x1);  
			     }
				}
		
		void show() {
			System.out.println(outer_x1);
		           }
	}

		public class innerclass_example1 { 
	public static void main(String[] args) {
	Outer1 outer1 = new Outer1();
	outer1.test();
	}
}
