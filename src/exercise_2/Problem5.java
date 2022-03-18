package exercise_2;


class Base{
	public void add(int a, int b) {
		System.out.println("Base method "+(a+b));
	}
}

public class Problem5 extends Base{

	@Override
	public void add(int a, int b) {
		System.out.println("Overridden method "+(a+b));
	}
	
	public void sayHii() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		Problem5 obj = new Problem5();
		obj.add(1, 2);
		obj.sayHii();
		Base obj1=new Base();
		obj1.add(1, 2);
		obj=(Problem5)obj1;
		obj.sayHii();
	}
}
