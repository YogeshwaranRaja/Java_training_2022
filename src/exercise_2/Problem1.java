package exercise_2;

public class Problem1 {
	int a, b, c;

	public Problem1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Problem1(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int add(int a, int b) {
		return a + this.a + b + this.b;
	}

	public int add(int a, int b, int c) {
		return a + this.a + b + this.b + c + this.c;
	}

	public static void main(String[] args) {
		Problem1 obj = new Problem1(1, 2);

		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 2, 3));
	}
}
