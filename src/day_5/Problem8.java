package day_5;

class SingletonClass {
	public int a;

	private static SingletonClass object = null;

	private SingletonClass(int a) {
		this.a = a;
	}

	public static SingletonClass getInstance(int a) {
		if (object == null)
			return new SingletonClass(a);
		return object;

	}

}

public class Problem8 {

	public static void main(String[] args) {
		SingletonClass obj1=SingletonClass.getInstance(10);
		SingletonClass obj2=SingletonClass.getInstance(20);
		System.out.println(obj1.a);
		System.out.println(obj2.a);
		
	}
}
