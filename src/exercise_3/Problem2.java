package exercise_3;

class A {

	int i, j;

	void print() {
		System.out.println(i + " " + j);
	}
}

class B extends A {
	int k;

	void print() {
		System.out.println(k);
	}

	void sum() {
		System.out.println(i+j+k);
	}
}

 public class Problem2 {

	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();

		objA.i=objA.j=10;

		objB.i=objB.j=20;
		
		objA.print();
		objB.print();
		
		objB.sum();

	}

}
