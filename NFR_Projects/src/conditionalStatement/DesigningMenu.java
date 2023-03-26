package conditionalStatement;

import java.util.Scanner;

public class DesigningMenu {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Number 1: ");
		int input1 = scanner.nextInt();

		System.out.print("Enter the Number 2: ");
		int input2 = scanner.nextInt();

		System.out.print("Enter the Number 3: ");
		int input3 = scanner.nextInt();
		System.out.println("Enter the Menu option to perform Arithmetic calculation: " + input3);

		if (input3 == 1) {
			System.out.println(input1 + input2);
		}

		if (input3 == 2) {
			System.out.println(input1 - input2);
		}

		if (input3 == 3) {
			System.out.println(input1 * input2);
		}

		if (input3 == 4) {
			System.out.println(input1 / input2);
		}

	}

}
