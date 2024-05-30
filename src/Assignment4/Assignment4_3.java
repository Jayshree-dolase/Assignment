package Assignment4;
/* Write the java program to design method for multiplication of two number
 which returns int value to that method and result should be print into main method.
 */
public class Assignment4_3 {

	public int multiplication() {
		int a=10;
		int b=30;
		int c=a*b;
		return c;
	}
	public static void main(String[] args) {
		Assignment4_3 ass4_3 =new Assignment4_3();
		int Mult=ass4_3.multiplication();
		System.out.println("Multiplication of two given number is:"+Mult);
		
	}

}
