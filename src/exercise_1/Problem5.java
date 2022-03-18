package exercise_1;

import java.util.Scanner;


public class Problem5 {
	
	static double getAverage(int sum,int n) {
		return sum/n;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt(),sum=0;
		System.out.println("Enter "+n+" numbers");
		for(int i=0;i<n;i++) {
			sum+=sc.nextInt();
		}
		System.out.println("The average is "+getAverage(sum, n));
		sc.close();
	}
}
