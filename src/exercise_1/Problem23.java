package exercise_1;

class Base1 {

	protected int a;

	public Base1() {
		a = 10;
	}
}

public class Problem23 {

	public static void main(String[] args) {
		Base1 obj = new Base1();
		obj.a=12;
		System.out.println("Value of protected variable is :"+obj.a);
	}
}
