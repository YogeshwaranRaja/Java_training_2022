package exercise_3;

interface A6 {
	void fun();
}

interface B6 {
	void fun();
}

public class Problem8 implements A6,B6{
	@Override
	public void fun() {
		System.out.println("overridden method");
	}
	
	public static void main(String[] args) {
		new  Problem8().fun();
	}
}
