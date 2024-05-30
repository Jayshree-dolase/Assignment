package Assignment4;
/*1. Write the java program to design method for addition of two number
  which returns int results to that method and result should be print into main method.
 */
public class Assignment4 {
	//int a=20;
	//int b=30;
	public int addition(int a,int b) {
		

		int c=a+b;
		System.out.println("Addition of two number is :"+c);
		return c;
		
		
	}
	public int substraction(int a,int b) {
		int c=a-b;
		System.out.println("substraction of two number is :"+c);
		return c;
	}
   public int multiplication(int a,int b) {
		
		int c=a*b;
		System.out.println("Multiplication of two number is :"+c);
		return c;
		}
   public int division(int a,int b) {
		
		int c=a/b;
		System.out.println("Division of two number is :"+c);
		return c;
		}
	public static void main(String[] args) {
		int p=20;
		int q=50;
		Assignment4 ass4= new Assignment4();
		 ass4.addition(p,q);
		 ass4.substraction(p,q );
		 ass4.multiplication(p, q);
		 ass4.division(p, q); 


	}

}
