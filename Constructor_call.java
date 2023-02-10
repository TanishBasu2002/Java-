package oops_btech;

public class Constructor_call  {

	  int sum;

	  // first constructor
	  Constructor_call() {
	    // calling the second constructor
	    this(5, 2);
	  }

	  // second constructor
	  Constructor_call(int arg1, int arg2) {
	    // add two value
	    this.sum = arg1 + arg2;
	  }

	  void display() {
	    System.out.println("Sum is: " + sum);
	  }

	  // main class
	  public static void main(String[] args) {

	    // call the first constructor
		  Constructor_call obj = new Constructor_call();

	    // call display method
	    obj.display();
	  }
	}