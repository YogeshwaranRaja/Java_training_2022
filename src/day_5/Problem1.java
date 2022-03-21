package day_5;

import java.security.PublicKey;
import java.util.Arrays;

public class Problem1 {
	int a;
	
	public Problem1(int a) {
		this.a=a;
	}
	
	public static void changeValues(Problem1 obj,int a,int[] arr) {
		obj.a=20;
		a=20;
		arr[0]=arr[1]=arr[2]=5;
	}
	
	public static void main(String[] args) {
		int a=2;
		int[]arr=new int[5];
		Problem1 obj= new Problem1(2); 
		System.out.println("Values before change function");
		System.out.println("Value of int in obj "+obj.a);
		System.out.println("Value of int in main "+a);
		System.out.println("Value of arr in main "+Arrays.toString(arr));
		changeValues(obj, a, arr);
		System.out.println("Values after change function");
		System.out.println("Value of int in obj "+obj.a);
		System.out.println("Value of int in main "+a);
		System.out.println("Value of arr in main "+Arrays.toString(arr));
	}
}