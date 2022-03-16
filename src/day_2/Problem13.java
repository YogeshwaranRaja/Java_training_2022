package day_2;

import java.util.Scanner;


public class Problem13 {

	static void printStudentResults(int arr[][],int m){
		int i=0;
		for(int[] row:arr) {
			i++;
			if(row[m]>m*35) {
				System.out.println("Student "+i+": Pass");
			}else {
				System.out.println("Student "+i+": Fail");				
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students and number of subjects");
		int n=sc.nextInt(),m=sc.nextInt(),arr[][]=new int[n][m+1];
		for(int i=0;i<n;i++) {
			System.out.println("Please enter the marks of student "+i+1+": ");
			int total=0;
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
				total+=arr[i][j];
			}
			arr[i][m]=total;
		}
		printStudentResults(arr,m);
		sc.close();
	}
}
