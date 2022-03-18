package exercise_2;

public class Problem4 {
	public void sum(int a, long b) {
		System.out.println(a+b);
	}

	public void sum(long a, int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Problem4 obj = new Problem4();
		
		int a=1,c=2;
		long b=3,d=4;
		
		obj.sum(a, b);
		obj.sum(d, c);
	}
}
