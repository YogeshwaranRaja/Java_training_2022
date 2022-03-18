package exercise_1;

import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {
	static boolean ASCENDING=true;
	static boolean DESCENDING=false;
	
	public static void swap (int array[], int x, int y)
    {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
    }
	
	public static void quickSort(int[] arr, int low, int high,boolean modifier) 
	  {
	    if (arr == null || arr.length == 0){
	      return;
	    }
	    if (low >= high){
	      return;
	    }

	    int middle = low + (high - low) / 2;
	    int pivot = arr[middle];
	    int i = low, j = high;
	    while (i <= j) 
	    {
	      while (arr[i] < pivot ^ modifier) 
	      {
	        i++;
	      }
	      while (arr[j] > pivot ^ modifier) 
	      {
	        j--;
	      }
	      if (i <= j ^ modifier) 
	      {
	        swap (arr, i, j);
	        i++;
	        j--;
	      }
	    }
	    if (low < j){
	      quickSort(arr, low, j,modifier);
	    }
	    if (high > i){
	      quickSort(arr, i, high,modifier);
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
//		ASCENDING ORDER
		quickSort(arr, 0, n-1, ASCENDING);
		System.out.println("ASCENDING ORDER:\n"+Arrays.toString(arr));
		quickSort(arr, 0, n-1, DESCENDING);
		System.out.println("DESENDING ORDER:\n"+Arrays.toString(arr));
		sc.close();
	}
}
