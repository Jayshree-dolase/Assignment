package Assignment4;
/* Write the java program to design method for substraction of two number which 
returns int value to that method and result should be print into main method.
*/
public class Assignment4_2 {
	public int substraction() {
		int a= 10;
		int b=20;
		int c=a-b;
		return c;
		
	}

	public static void main(String[] args) {
		Assignment4_2 ass4_2= new Assignment4_2();
		int Sub=ass4_2.substraction();
		System.out.println("substraction of two number is :"+Sub);
	}
}
