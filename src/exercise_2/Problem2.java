package exercise_2;

public class Problem2 {
	public int add(int a, int b) {
		return a + b;
	}

	public double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Problem2 obj = new Problem2();

		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1.1, 2.2));
	}
}
