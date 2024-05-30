package Assignment6;
// 3.write a program to print all even number from 50 to 75.

public class Even {

	
public int getEven1() {
		
		for(int i=50;i<=75;i++) {
			if(i%2==0) 
				return i;
		}
		return 0;
		}
	public void getEven() {
		
		for(int i=50;i<=75;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}}
	
	public static void main(String[] args) {
		Even even= new Even();
	//	even.getEven();
		int x=even.getEven1();
		System.out.println(x);
	}

}
