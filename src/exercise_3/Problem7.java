package exercise_3;

class A5 {
	void fun() {
		
	}
}

class B5 {
	void fun() {
		
	}
}

public class Problem7 extends A5,B5{
	@Override
	public void fun() {
		System.out.println("overridden method");
	}
	
	public static void main(String[] args) {
		new  Problem7().fun();
	}
}
