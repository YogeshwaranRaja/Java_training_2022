package day_2;

import java.util.Arrays;

public class Problem6 {
	public static void main(String[] args) {	
		int[] originalArray=new int[10];
		System.out.println("The size of the original array: "+originalArray.length);
		int[] duplicateArray=Arrays.copyOf(originalArray, 20);
		System.out.println("The size of the extended array: "+duplicateArray.length);
	}
}
