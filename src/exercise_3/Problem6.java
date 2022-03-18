package exercise_3;

class A4 {
	public A4() {
		System.out.println("parent contructor");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("parent destructor");
	}
}

class B4 extends A4 {
	public B4() {
		System.out.println("child constructtor");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("child destructor");
	}
}

public class Problem6 extends B4 {
	public Problem6() {
		System.out.println("Grand child constructor");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Grand child destructor");
	}

	public static void main(String[] args) {
		Problem6 objProblem6 = new Problem6();

		objProblem6 = null;
		System.gc();
	}
}
