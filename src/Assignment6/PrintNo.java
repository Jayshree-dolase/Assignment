package Assignment6;
//1.write a program to print 25 to 50 numbers using while loop.

public class PrintNo {

	public void getNo() {
		int x=25;
		int y=50;
		for(; x<=y;x++) {
			System.out.println(x);
		
		}
		
	}
	public static void main(String[] args) {
		
		PrintNo printno =new PrintNo();
		
		printno.getNo();

	}

}
