package Assignment4;
/*1. Write the java program to design method for addition of two number
which returns int results to that method and result should be print into main method.
*/
public class Assignment4_1 {
	public int addition() {
		int a=20;
		int b=30;
		int c=a+b;
		return c;
		
	}
	public static void main(String[] args) {
		Assignment4_1 ass4= new Assignment4_1();
		int Add= ass4.addition();
		System.out.println("Addition of two number is :"+Add);

	}

}
