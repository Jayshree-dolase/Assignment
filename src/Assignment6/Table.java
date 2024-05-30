package Assignment6;
/* 2. Design method void multiplication (int no) and print the multiplication table.
 *  ( Example enter the no=5 then output like
*/
public class Table {

	public void multiplication(int No) {
		for(int i=1;i<=10;i++) {
		int result= No*i;
		System.out.println(No+"*"+i+"="+result);
	}
	}
	public static void main(String[] args) {
		Table table = new Table();
				table.multiplication(6);

	}

}
