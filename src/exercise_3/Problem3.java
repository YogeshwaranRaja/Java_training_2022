package exercise_3;

class A1 {

	private int a;
	int b;

	void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
	void print() {
		System.out.println(a+" "+b);
	}
}

class B1 extends A1 {

	int a;
	void sum() {
		System.out.println(this.a+this.b);
	}
//	void set(int a, int b) {
//		this.a = a;
//		this.b = b;
//	}

}

public class Problem3 {
	public static void main(String[] args) {

		A1 objA1 = new A1();
		objA1.set(10, 20);
		B1 objB1 =new B1();
		objB1.set(10, 20);
		objB1.sum();
		objB1.print();
	}
}
