package exercise_1;

import java.util.Scanner;


public class Problem13 {

	static void printStudentResults(boolean results[]){
		int i=0;
		for(boolean result:results) {
			i++;
			if(result) {
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
		boolean[] studentResult=new boolean[n];
		for(int i=0;i<n;i++) {
			System.out.println("Please enter the marks of student "+(i+1)+": ");
			int total=0;
			boolean isPass=true;
			for(int j=0;j<m;j++) {
				
				arr[i][j]=sc.nextInt();
				total+=arr[i][j];
				isPass&=(arr[i][j]>=35);
			}
			studentResult[i]=isPass;
			arr[i][m]=total;
		}
		printStudentResults(studentResult);
		sc.close();
	}
}
