package exercise_3;

class A {

	int i, j;

	public A(int i, int j) {
		this.i = i;
		this.j = j;
	}

	void print() {
		System.out.println(i + " " + j);
	}
}

class B extends A {
	
	int k;
	
	public B(int i, int j,int k) {
		super(i, j);
		this.k=k;
	}

	void print() {
		System.out.println(k);
	}

	void sum() {
		System.out.println(i+j+k);
	}
}

 public class Problem2 {

	public static void main(String[] args) {
		A objA = new A(10,20);
		B objB = new B(10,20,30);
		
		objA.print();
		objB.print();
		
		objB.sum();

	}

}
