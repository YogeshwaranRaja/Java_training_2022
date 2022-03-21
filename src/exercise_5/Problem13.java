package exercise_5;

import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=10;i++) {
			try {
				System.out.println(String.format("Please enter the mark of Student %d", i));
				String inpString=scanner.next();
				sum+=Integer.parseInt(inpString);
			} catch (Exception e) {
				i--;
			}
			
		}
		System.out.println("The average mark of 10 students is :"+sum/10);
		scanner.close();
	}
}
