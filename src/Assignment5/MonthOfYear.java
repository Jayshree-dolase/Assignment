package Assignment5;
//4.Write a program to print month of year. Case 1 January case 2 February case n....use switch case

public class MonthOfYear {

	public void getM(int month) {
		
		switch(month) {
		case 1:
			System.out.println("January");
		      break;
		case 2:
			System.out.println("February");
		      break;
		case 3:
			System.out.println("March");
		      break;
		case 4:
			System.out.println("April");
		      break;
		case 5:
			System.out.println("May");
		      break;
		case 6:
			System.out.println("June");
		      break;
		case 7:
			System.out.println("July");
		      break;
		case 8:
			System.out.println("Augest");
		      break;
		case 9:
			System.out.println("Septmber");
		      break;
		case 10:
			System.out.println("Octomber");
		      break;
		case 11:
			System.out.println("November");
		      break;
		      
		case 12:
			System.out.println("December");
		      break;
		default :
			System.out.println("Only 12 Month is Present in month");
		      break;
		}
	}
	
	public String getMonth(int month) {
		
		switch(month) {
		
		case 1:
			return "January";
			
		case 2:
			return "Feb";
		case 3:
			return "March";
		case 4:
			return "April";
			
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "Augest";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			return "Match Not Found";
		}
		
		
		
	}
	
	public static void main(String[] args) {
		 
		MonthOfYear m= new MonthOfYear();
		String str=m.getMonth(19);
		System.out.println(str);
		
	      //m.getM(29);
		
	}

}
