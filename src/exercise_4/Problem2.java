package exercise_4;


class NormallyUnnormal{
final int unchangeable=1;
	
	final void unChangeableMethod() {
		System.out.println("I am unchangeable");
	}
	
	public void changeTheUnchangeable() {
		this.unchangeable=10;
	}
}

class ChangeIt extends NormallyUnnormal{
	
	@Override
	final void unChangeableMethod() {
		System.out.println("I will try to change anyways");
	}
}

final class UnchangeableClass{
	public UnchangeableClass() {
		System.out.println("I am unchangeable class");
	}
}

class UnchangeableChild extends UnchangeableClass{
	public UnchangeableChild() {
		System.out.println("Unborn child of unchangeable class");
	}
}

public class Problem2 extends Integer {
	@Override
	public String toString() {
		System.out.println("Bruh! really ?");
	}
}

class Problem3 extends ChangeIt{
	
}





