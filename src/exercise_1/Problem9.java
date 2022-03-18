package exercise_1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem9 {
	
	static void reverse(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n/2;i++) {
			int temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=sc.nextInt(),arr[]=new int[n];
		System.out.println("please enter the elements of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array in original order");
		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println("Array in reverse order");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
