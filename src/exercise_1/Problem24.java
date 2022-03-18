package exercise_1;

 class Abc {
	private int a,b,c;
	public Abc() {
		a=b=c=1;
	}
	public Abc(int x,int y,int z) {
		a=x;
		b=y;
		c=z;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	public void setABC(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public int compute(int x) {
		int out=(this.a*x*x)+(this.b*x)+(this.c);
		return out;
	}
}
 
public class Problem24{
	public static void main(String[] args) {
		Abc obj1=new Abc();
		Abc obj2=new Abc(1, 2, 3);
		System.out.println("Value of a "+obj2.getA());
		System.out.println("Value of b "+obj2.getB());
		System.out.println("Value of c "+obj2.getC());
		obj1.setABC(1, 3, 3);
		System.out.println("Value of a "+obj1.getA());
		System.out.println("Value of b "+obj1.getB());
		System.out.println("Value of c "+obj1.getC());
		System.out.println("Value of the function f(4) is: "+obj1.compute(4));
	}
	
}
