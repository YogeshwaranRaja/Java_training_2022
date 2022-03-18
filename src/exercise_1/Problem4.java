package exercise_1;

import java.util.Scanner;

public class Problem4 {
	static boolean isPrime(int n) {
		if(n<=1)	return false;
		if(n<4)	return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5;i<n/2;i+=6) {
			if(n%i==0 || n%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter the number");
		int n=scanner.nextInt();
		System.out.println(n+(isPrime(n)?" is":" is not")+ " a prime number");
		scanner.close();
	}
}
