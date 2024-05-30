package Assignment7;
//1. Design method to check whether the character is alphabet, digit and special symbol.

import java.util.Scanner;

public class Assignment1 {

	public void toCheck(char ch) {

		if ((ch == 'a' || ch == 'A') || (ch == 'b' || ch == 'B') || (ch == 'c' || ch == 'C') || (ch == 'd' || ch == 'D')
				|| (ch == 'e' || ch == 'E') || (ch == 'f' || ch == 'F') || (ch == 'g' || ch == 'G')
				|| (ch == 'h' || ch == 'H') || (ch == 'i' || ch == 'I') || (ch == 'j' || ch == 'J')
				|| (ch == 'k' || ch == 'K') || (ch == 'l' || ch == 'L') || (ch == 'm' || ch == 'M')
				|| (ch == 'n' || ch == 'N') || (ch == 'o' || ch == 'O') || (ch == 'p' || ch == 'P')
				|| (ch == 'q' || ch == 'Q') || (ch == 'r' || ch == 'R') || (ch == 's' || ch == 'S')
				|| (ch == 't' || ch == 'T') || (ch == 'u' || ch == 'U') || (ch == 'v' || ch == 'V')
				|| (ch == 'w' || ch == 'W') || (ch == 'x' || ch == 'X') || (ch == 'y' || ch == 'Y')
				|| (ch == 'z' || ch == 'Z')) {
			System.out.println("Given letter is charachter.");
		} else if (ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7'
				|| ch == '8' || ch == '9') {

			System.out.println("Given letter is Digit.");
		} else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*'
				|| ch == '(' || ch == ')' || ch == ',' || ch == '.' || ch == '/' || ch == ';' || ch == ':' || ch == '"'
				|| ch == '[' || ch == ']' || ch == '{' || ch == '}' || ch == '?' || ch == '<' || ch == '>' || ch == '|'
				|| ch == '+' || ch == '=' || ch == '-' || ch == '_') {
			System.out.println("Given Letter is Special Charater.");

		}else {
			System.out.println("Input missmatch");
		}

		// System.out.println("Hello "+c);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter chrater :");
		char c = sc.next().charAt(0);

		Assignment1 ass = new Assignment1();
		ass.toCheck(c);
		
	}

}
