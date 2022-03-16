package day_2;

import java.util.Scanner;

public class Problem16 {
	
	static void indexOf(int arr[],int locate) {
		int index=0;
		int count=0;
		for(int i:arr) {
			if(i==locate) {
				count++;
				System.out.println("Element found at index : "+index);
			}
			index++;
		}
		if(count==0) {
			System.out.println("The element was not found");
		}
		else {
			System.out.println("The element was found "+count+" times");			
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
