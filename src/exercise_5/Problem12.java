package exercise_5;

import java.util.Scanner;

public class Problem12 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			try {
				
				System.out.println("Please enter the numerator and denominator");
				String choiceString1=scanner.next();
				String choiceString2=scanner.next();
				if(("q").equalsIgnoreCase(choiceString1) || ("q").equalsIgnoreCase(choiceString2)) {
					break;
				}
				int numerator=Integer.parseInt(choiceString1);
				int denominator=Integer.parseInt(choiceString2);
				System.out.println(numerator/denominator);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}			
			
		}
		scanner.close();
	}
}
