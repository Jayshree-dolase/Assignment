package Assignment4;
/* Write the java program to design method for division of two number 
 * which returns int value to that method and result should be print into main method.
 */
public class Assignment4_4 {
    public int division() {
    	int a=45;
    	int b=20;
    	int c=a/b;
    	return c;
    }
	public static void main(String[] args) {
		Assignment4_4 ass4_4=new Assignment4_4();
		int Div=ass4_4.division();
		System.out.println("Division of two given number is :"+Div);

	}

}
