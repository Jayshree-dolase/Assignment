package ConceptWise_Test;

import java.util.Scanner;

/*
 * Method Implementation:
You're developing a geometry library for a project. Write a Java method named 
calculateArea that takes the radius of a circle as a parameter and returns the area of 
the circle. Explain how you would handle invalid input (negative radius values). 
Provide a test case where the radius is 5 units and ensure the method returns the 
 */
public class Llibrary {
   static float Pai=3.14f;
	public float calculateArea(int redius) {
		float Area = Pai*redius*redius;
		return Area;
		
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Redius to calculate");
		Llibrary lib= new Llibrary();
		
		float Area1=lib.calculateArea(sc.nextInt());
		System.out.println(Area1);

	}

}
