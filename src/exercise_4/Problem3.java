package exercise_4;

class Counter1{
	int counter;
	
	public void incrementCounter() {
		System.out.println(++this.counter);
	}
}

class Counter2{
	static int counter;
	
	public void incrementCounter() {
		System.out.println(++counter);
	}
}

public class Problem3 {
	static void staticMethod() {
		System.out.println("Hii I'am the static method");
	}
	
	 void notAStaticMethod() {
		System.out.println("Hii I'am the notAStatic method");
	}
	
	public static void main(String[] args) {
		Counter1 obj1=new Counter1(),obj2=new Counter1();
		
		obj1.incrementCounter();
		obj2.incrementCounter();
		
		Counter2 obj3=new Counter2(),obj4=new Counter2();
		
		obj3.incrementCounter();
		obj4.incrementCounter();
		
		Problem3.staticMethod();
		new Problem3().notAStaticMethod();
		
	}
}
