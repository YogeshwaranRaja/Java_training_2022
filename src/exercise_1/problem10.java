package exercise_1;

import java.util.Scanner;

public class problem10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array rows and columns");
		int m=sc.nextInt(),n=sc.nextInt(),arr[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=i*m+j+1;
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				 System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
