/**
 * implementation of abstract class and method
 */
package oops_btech;

	abstract class Stream {
		   abstract void Subjects();

		}

    class CSE extends Stream {
		   public void Subjects() {
		      System.out.println("DS, OS, OOPs");
		   }
		}

	class ECE extends Stream {
		   public void Subjects() {
		      System.out.println("Maths, Communication");
		   }
		}

	class abstract_method {
		   public static void main(String[] args) {
		      CSE d1 = new CSE();
		      d1.Subjects();

		      ECE c1 = new ECE();
		      c1.Subjects();
		   }
		}
