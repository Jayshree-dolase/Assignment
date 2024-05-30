package com.mini_Project;

import java.util.Scanner;

public class User_Input {

	public static Scanner sc = new Scanner(System.in);

	void displayCacultor() {
		System.out.println("\n" + "                                 **!   Simple Calculator !**                  ");
		System.out.println("\n" + "                       1.Addition                    2.Subtraction");
		System.out.println("                       3.Multiplication              4.Division");
		System.out.println("                       5.Modulus                     6.Square");
		System.out.println("                       7.Cube                        8.Average");
		System.out.println("                       9.Factors                     10.even or odd");
		System.out.println("                       11.Exit                     ");
		System.out.println("\n"+ "        =============================================================================================");
	}

	void createCalculator() {

		Addition_two_No addition = new Addition_two_No();
		Subtraction_Two_No subtraction = new Subtraction_Two_No();
		Multiplication_Two_No multipication = new Multiplication_Two_No();
		Division_Two_No division = new Division_Two_No();
		Modulus_Two_No modulus = new Modulus_Two_No();
		SquareOf_Number square = new SquareOf_Number();
		CubeOf_Number cube = new CubeOf_Number();
		AverageOf_Number average = new AverageOf_Number();
		FactorsOf_Number factors = new FactorsOf_Number();
		Even_Odd_Number evenodd = new Even_Odd_Number();

		System.out.println("\n" + "\n" + "                       Enter Which type of Operation you want to Perform : ");
		int userInput = sc.nextInt();

		while (userInput != 12) {

			switch (userInput) {

			case 1: {

				System.out.println("\n" + "                         Enetr two number for addition ");
				System.out.println("\n" + "                         Enter First number : ");
				double firstNo = sc.nextDouble();
				System.out.println("                         Enter Second number : ");
				double secondNo = sc.nextDouble();
				double additionResult = addition.calculateAddition(firstNo, secondNo);
				System.out.println("                         Addition of " + firstNo + " & " + secondNo + "  is : "
						+ additionResult);

				break;
				

			}

			case 2: {

				System.out.println("\n" + "                         Enetr two number for Subtraction ");
				System.out.println("\n" + "                         Enter First number : ");
				double firstNo = sc.nextDouble();
				System.out.println("                         Enter Second number : ");
				double secondNo = sc.nextDouble();
				double subtractionResult = subtraction.subtraction(firstNo, secondNo);
				System.out.println("                         Subtraction of " + firstNo + " & " + secondNo + " is : "
						+ subtractionResult);
				break;
			}
			case 3: {

				System.out.println("\n" + "                         Enetr two number for Multiplication ");
				System.out.println("\n" + "                         Enter First number : ");
				double firstNo = sc.nextDouble();
				System.out.println("                        Enter Second number : ");
				double secondNo = sc.nextDouble();
				double multilicationResult = multipication.clculateMultilication(firstNo, secondNo);
				System.out.println("                         Multipication of " + firstNo + " & " + secondNo + " is : "
						+ multilicationResult);
				break;
			}
			case 4: {

				System.out.println("\n" + "                         Enetr two number for Division ");
				System.out.println("\n" + "                         Enter First number : ");
				double firstNo = sc.nextDouble();
				System.out.println("                        Enter Second number : ");
				double secondNo = sc.nextDouble();
				double divisionResult = division.calculateDivision(firstNo, secondNo);
				System.out.println("                         Division of " + firstNo + " & " + secondNo + " is : "
						+ divisionResult);
				break;
			}
			case 5: {

				System.out.println("\n" + "                         Enetr two number for Modulus ");
				System.out.println("\n" + "                         Enter First number : ");
				double firstNo = sc.nextDouble();
				System.out.println("                        Enter Second number : ");
				double secondNo = sc.nextDouble();
				double modulusResult = modulus.calculateModulus(firstNo, secondNo);
				System.out.println(
						"                         Modulus of " + firstNo + " & " + secondNo + " is : " + modulusResult);

				break;
			}
			case 6: {

				System.out.println(
						"\n" + "                         Enetr a number to calculate Square of given number : ");
				int number = sc.nextInt();
				int squareResult = square.calculateSquare(number);
				System.out.println("                         Square of  " + number + " is : " + squareResult);
				break;
			}

			case 7: {

				System.out
						.println("\n" + "                         Enetr a number to calculate Cube of given number : ");
				int number = sc.nextInt();
				int cubeResult = cube.calculateCube(number);
				System.out.println("                         cube of  " + number + " is : " + cubeResult);

				break;
			}
			case 8: {

				System.out.println("\n" + "                         How Many Number you want to calculate Average: ");
				int number = sc.nextInt();
				double number1 = 0;
				double Sum = 0;
				for (int i = 1; i <= number; i++) {
					System.out.println("Enter  Number :");
					number1 = sc.nextDouble();

					Sum = Sum + number1;
					if (number > number) {
						break;
					}

				}
				double averageResult = average.average(Sum, number);
				System.out.println("Average is :" + averageResult);
				System.out.println("                         Total Sum is : " + Sum);

				System.out.println("                         Average of given number's is : " + averageResult);

			}
			case 9: {

				System.out.println("\n" + "                         Enetr a number to calculate Factors : ");
				int number = sc.nextInt();
				factors.calculateFactors(number);
				break;
			}

			case 10: {

				System.out.println(
						"\n" + "                       Enetr a number to check given number is even or odd  : ");
				int number = sc.nextInt();

				String result = evenodd.checkEvenOdd(number);
				System.out.println("                         Given Number is : " + result);
				break;

			}

			case 11: {

				if (userInput == 11) {
					System.out
							.println("\n" + "                       Invalid choice please Select choice from 1 to 10.");
					break;
				}
			}

			}

			System.out.println("\n"+ "        =============================================================================================");

			System.out.println("\n" + "                         Do you want to perfom any other operation (Y/N) : ");
			char result = sc.next().charAt(0);
			if (result == 'Y' || result == 'y') {
				displayCacultor();
				createCalculator();
			} else if (result == 'N' || result == 'n') {
				System.out.println("\n" + "                                  Thank You! ");
			} else {
				System.out.println("                               Thank you ! ");
			}
			break;
		}

	}

}
