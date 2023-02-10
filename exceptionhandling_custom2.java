package oops_btech;
//example of Custom Exception
class MyException1 extends Exception {
	private int detail;
	//System.out.println("5");
	MyException1(int a) {
	detail = a;
	System.out.println(a);
	}
	public String toString() {
		System.out.println("6");
	return "MyException[" + detail + "]";
	}
}

class exceptionhandling_custom2 {
		static void compute(int a) throws MyException1 {
			System.out.println("7");
		System.out.println("Called compute(" + a + ")");
		if(a < 10)
		throw new MyException1(a);
		System.out.println("Normal exit");
		}
public static void main(String args[]) {
try {
	System.out.println("5");
compute(1);
System.out.println("1");
compute(20);
} catch (MyException1 e) {
	System.out.println("4");
System.out.println("Caught " + e);
}
}
}