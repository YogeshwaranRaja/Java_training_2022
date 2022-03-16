package day_2;

import java.util.Scanner;

public class Problem20 {
	
	static void reverse(int arr[][]) {
		int n=arr[0].length;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<n/2;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][n-1-j];
				arr[i][n-1-j]=temp;
			}			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array rows and columns");
		int m=sc.nextInt(),n=sc.nextInt(),arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array in original order");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				 System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		reverse(arr);
		System.out.println("Array in reverse order");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				 System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
