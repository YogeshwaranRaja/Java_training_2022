package day_2;

import java.util.Scanner;

public class Problem21 {

	static String calculateLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
					return "29 days";
				else
					return "28 days";
			} else
				return "29 days";
		}

		else
			return "28 days";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the month and year");
		int month = sc.nextInt(), year = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("31 days");
			break;
		case 2:
			System.out.println(calculateLeapYear(year));
			break;
		case 3:
			System.out.println("31 days");
			break;
		case 4:
			System.out.println("30 days");
			break;
		case 5:
			System.out.println("31 days");
			break;
		case 6:
			System.out.println("30 days");
			break;
		case 7:
			System.out.println("31 days");
			break;
		case 8:
			System.out.println("31 days");
			break;
		case 9:
			System.out.println("30 days");
			break;
		case 10:
			System.out.println("31 days");
			break;
		case 11:
			System.out.println("30 days");
			break;
		case 12:
			System.out.println("31 days");
			break;

		default:
			System.err.println("Please enter a valid month");
			;
		}
		sc.close();
	}
}
