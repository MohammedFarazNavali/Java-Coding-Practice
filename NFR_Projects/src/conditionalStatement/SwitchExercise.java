package conditionalStatement;

import java.util.Scanner;

public class SwitchExercise {

	public static void main(String[] args) {

		// isWeekDay(0);
		System.out.println(determineNameOfMonth(10));

	}

	public static boolean isWeekDay(int dayNumber) {

		System.out.println("Enter the Number");
		Scanner scanner = new Scanner(System.in);
		dayNumber = scanner.nextInt();
		switch (dayNumber) {

		case 0:
			System.out.println("Sunday");
			break;

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Friday");
			break;

		case 6:
			System.out.println("Saturday");
			break;
		}

		return false;
	}

	public static String determineNameOfMonth(int monthNumber) {

		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "Febraury";
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
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		}
		return "Invalid Day";

	}
}
