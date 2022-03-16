package day_2;

import java.util.Scanner;

public class Problem8 {
	
	static void indexOf(int arr[],int locate) {
		int index=0;
		for(int i:arr) {
			if(i==locate) {
				System.out.println("Element found at index : "+index);
			}
			index++;
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
	System.out.println("Enter the element to locate");
	int locate=sc.nextInt();
	indexOf(arr, locate);
	sc.close();
}
}
