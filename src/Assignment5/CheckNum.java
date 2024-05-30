package Assignment5;
// 6. Write the program to check whether the no is greater than 100.
public class CheckNum {

	public static boolean getNumber(int No) {
		if(No>100) {
			return true;
		}
		return false;
	}
	
	public void getGreaterNum( int No) {
		
		if(No>100) {
			System.out.println(" No is greater than 100");
			}
		System.out.println("I am Non Static method");
	}
	
	public static void main(String[] args) {
		//CheckNum checknum = new CheckNum();
		//checknum.getGreaterNum(105);
		
		boolean str= getNumber(100);
		System.out.println(str);
	}

}
