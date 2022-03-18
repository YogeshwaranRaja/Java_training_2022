package exercise_1;

import java.util.Scanner;

public class Problem15ii {
	
	static boolean isAmstrong(int n) {
		int cubeVal=0,temp=n;
		while(temp>0) {
			cubeVal+=(int) Math.pow(temp%10, 3);
			temp/=10;
		}
		if(n==cubeVal)
			return true;
		return false;
	}
	
	static boolean isPalindrome(int n) {
		String string=Integer.toString(n);
		return(new StringBuilder(string).reverse().toString()).equals(string);
	}
	
	static boolean isPerfectNumber(int n) {
		int i=2;
		int sum=1;
		while(i<=n/2) {
			if(n%i==0) {
				sum+=i;
			}
			i++;
		}
		return(sum==n);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		boolean flag=true;
		
		if(isAmstrong(n)) {
			System.out.println("The numer is a Amstrong nunber");
			flag=false;
		}
		
		if(isPerfectNumber(n)) {
			System.out.println("The number is a perfect number");
			flag=false;
		}
		
		if(isPalindrome(n)) {
			System.out.println("The number is a palindrome");
			flag=false;
		}
		
		if(flag) {
			System.out.println("The number has nothing special");
		}
		
		sc.close();
	}
}
