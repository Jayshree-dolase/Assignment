package Assignment2;

public class Assignment2 {
	int y=25;
public void primitive() {
	byte a;
    short b;
    int c;
    long d;
    float e;
    Double f;
    char g;
    Boolean h;
    int x;
    x=50;
    System.out.println("Value of Local variable is:"+x);

}
	public static void main(String[] args) {
		Assignment2 assignment = new Assignment2();
      //int  z=assignment.y;
		char a='j';
	      System.out.println("first character of my Name is::"+assignment.y);

      System.out.println("Value of Golbal variable is:"+assignment.y);
      assignment.primitive();
      
	}

}
