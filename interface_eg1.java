/**
 * 
 */
package oops_btech;

interface Polygon {
	    void getArea(int length, int breadth);
	}

	class Rectangle1 implements Polygon {
	    public void getArea(int length, int breadth) {
	        System.out.println("The area of the rectangle is " 
	    + (length * breadth));
	    }
	}

	class interface_eg1 {
	    public static void main(String[] args) {
	        Rectangle1 r1 = new Rectangle1();
	        r1.getArea(5, 6);
	    }
	}