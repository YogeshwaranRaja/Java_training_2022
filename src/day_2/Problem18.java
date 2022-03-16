package day_2;

import java.util.Scanner;

public class Problem18 {
	
	 private static final String[] tens = {
			    "",
			    " ten",
			    " twenty",
			    " thirty",
			    " forty",
			    " fifty",
			    " sixty",
			    " seventy",
			    " eighty",
			    " ninety"
			  };

			  private static final String[] ones = {
			    "zero",
			    " one",
			    " two",
			    " three",
			    " four",
			    " five",
			    " six",
			    " seven",
			    " eight",
			    " nine",
			    " ten",
			    " eleven",
			    " twelve",
			    " thirteen",
			    " fourteen",
			    " fifteen",
			    " sixteen",
			    " seventeen",
			    " eighteen",
			    " nineteen"
			  };
	
	static String numberToWords(int n) {
		if (n == 0) { 
			return ones[n]; 
		}
		String out;

	    if (n % 100 < 20){
	      out = ones[n % 100];
	      n /= 100;
	    }
	    else {
	      out = ones[n % 10];
	      n /= 10;

	      out = tens[n % 10] + out;
	      n /= 10;
	    }
	    if (n == 0) return out;
	    return ones[n] + " hundred" + out;

	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(numberToWords(sc.nextInt()));
		sc.close();
	}
}
