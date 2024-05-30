package Assigenment_16;


public class Product {
	//int weight=2000;
	public void productCheck(int weight)  {
		 try {
		 if(weight <= 100) {
			 throw new  ProductException("Weight less than 100 are not allowed.");
		 }
		 }catch (ProductException e) {
			 System.out.println(e.getMessage());
		 }
	 }}
