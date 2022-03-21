package exercise_5;

import java.util.Scanner;

@SuppressWarnings("serial")
class NegativeInputException extends Exception {
	public NegativeInputException() {
		super("The input is less than 0");
	}
}

@SuppressWarnings("serial")
class OutOfRangeException extends Exception {
	public OutOfRangeException() {
		super("Marks should be  only between 0-100");
	}
}

public class Problem14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(String.format("Please enter the mark of Student %d", i));
				String inpString = scanner.next();
				int mark = Integer.parseInt(inpString);
				if (mark < 0) {
					throw new NegativeInputException();
				} else if (mark > 100) {
					throw new OutOfRangeException();
				} else {
					sum += mark;
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

		}
		System.out.println("The average mark of 10 students is :" + sum / 10);
		scanner.close();
	}
}
