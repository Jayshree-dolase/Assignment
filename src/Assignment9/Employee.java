package Assignment9;
/*
 * 1. Write the Java program in which create the multiple objects and display 
 * the count of number of objects created into class.

 */
public class Employee {

	public static void main(String[] args) {
		int count=0;
		Employee e = new Employee();
		count++;
		Employee e1 = new Employee();
		count++;
		
		Employee e2 = new Employee();
		count++;
		Employee e3 = new Employee();
		count++;
		Employee e4 = new Employee();
		count++;
	
	     System.out.println("The Number of Object of class Employee is : "+count);
	}
}
