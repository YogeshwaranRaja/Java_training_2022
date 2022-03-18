package exercise_3;

class A3{
	public A3() {
		System.out.println("Base contructor");
	}
}

class B3 extends A3{
	public B3() {
		super();
		System.out.println("Derrived constructtor");
	}
}

public class Problem5 {
	public static void main(String[] args) {
		new B3();		
	}
}
