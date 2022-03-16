package day_2;

class Base{
	
	private int a;
	public int b;
	protected int c;
	int d;
	public Base() {
		a=10;
		b=20;
		c=30;
		d=40;
	}
	protected void hello() {
		System.out.println("Value of private variable is: "+a);
	}
}

public class Problem22 {
	public static void main(String[] args) {
		Base obj=new Base();
//		obj.a;   Creates error
		obj.hello();
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
	}
	
}
