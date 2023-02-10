package oops_btech;
//example "throw"
public class exceptionhandling_throw2 {
	static void demoproc() {
		try {
		throw new NullPointerException("example");
		} catch(NullPointerException e) {
		System.out.println("Caught inside demoproc method");
		throw e; // rethrow the exception
		}
		}
		public static void main(String args[]) {
		try {
		demoproc();
		} catch(NullPointerException e) {
		System.out.println("Recaught: " + e);
		}
		}
		}
