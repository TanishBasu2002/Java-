package oops_btech;

public class this_example {

	int age;
	this_example(int age)
	{
     //age = age;
      this.age = age;
    }

    public static void main(String[] args) {
    	this_example obj = new this_example(8);
        System.out.println("obj.age = " + obj.age);
    }
}
