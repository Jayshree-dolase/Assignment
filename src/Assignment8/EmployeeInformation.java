package Assignment8;
/*
 * 1.1 Design the Employee class which contain
firstName, lastName, city and mobileNumber and  country.
1.2 Design the class as EmployeeInformation which takes the input for multiple employees from user and Design method public void getUserInput(), 
country is same for all the employees.
1.3 Pass the input to getEmployeeInformation() method
1.4 Print the multiple employee  information into getemployeeInformation () method.

 */
import java.util.Scanner;

public class EmployeeInformation {

	static Scanner sc = new Scanner(System.in);
	
	
	public void getUserInput(int num) {
		
		for(int i=1;i<=num;i++) {
			
		System.out.println("Enter Firstname of Employee: ");
		String FirstName = sc.next();

	
		
		System.out.println("Enter LastName of Employee: ");
		String LastName = sc.next();
		
		
		
		System.out.println("Enter City of Employee: ");
		String City = sc.next();
		
		

		System.out.println("Enter Mobile Number of Employee: "+"\n");
		long MobileNo = sc.nextLong();

		
		getEmployeeInformation(FirstName, LastName, City, MobileNo);
	}
	}
	public void getEmployeeInformation(String FirstName, String LastName, String City, long MobileNo) {

		System.out.println(" !!!!!!!! Employee Information !!!!!!!!!!!!!!!!!!! ");
		System.out.println("\n"+"FirstName of Employee is : " + FirstName);
		System.out.println("LastName of Employee is : " + LastName);
		System.out.println("City of Employee is : " + City);
		System.out.println("MobileNo of Employee is : " + MobileNo);

		System.out.println("Country of Employee is : " + Employee.country);
System.out.println("==================================================================================="+"\n");
	}

	public static void main(String[] args)  {
		System.out.println("How Many Employee Information You want: ");
		int num=sc.nextInt();
		
		
		
		EmployeeInformation ei = new EmployeeInformation();
		ei.getUserInput(num);
		
		System.out.println("How Many Employee Information You want: ");
		int num1=sc.nextInt();
		
		System.out.println("Do you want to Exit OR Continue with another employee.(If you want to continue then enter True,If you want to Exit then enter false.)");
		boolean result= sc.nextBoolean();
		
		
		
		
		if(result==true) {
		ei.getUserInput(num1);
		
		}else {
			System.out.println("Employee Information Successfully Added.");
		}
		
	}
	
}
