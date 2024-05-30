package Assignment5;
// 3.write a program to find out maximum number among three number(if else if ladder statement)

public class Maximum {

	
	public int greater(int x,int y,int z) {
		
		int maximum=z>(x>y ? x:y) ? z :((x>y)? x:y);
		return maximum;
	}
	
	public void  isMaximum(int x,int y,int z) {
		/* 
		 * x>=y && x>=z x
		 * y>=x  && y>=z y
		 * z>=x && z>=y z
		 * * */
		if(x>=y && x>=z) {
			//return x;
			System.out.println(x);
		}else if(y>=x && y>=z) {
			//return y;
			System.out.println(y);
		}else {
			//return z;
			System.out.println(z);
		}
		
	}
	public static void main(String[] args) {
		Maximum max=new Maximum();
	//int result=	max.isMaximum(9,2, 20);
	//System.out.println(result);
	
	// maxresult=max.greater(2, 1, 0);
	System.out.println(max.greater(59,450, 10));
	
	
	


}}
