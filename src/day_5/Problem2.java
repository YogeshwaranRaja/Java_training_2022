package day_5;

class ComplexNumber{
	
	int x,y;
	
	public ComplexNumber(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void printComplexNumber() {
		System.out.println(String.format("%di+%d",this.x,this.y));
	}
	
	public void addComplexnumbers(ComplexNumber obj) {
		this.x+=obj.x;
		this.y+=obj.y;
	}
}

public class Problem2 {
	
	
	public static void main(String[] args) {
		ComplexNumber obj1=new ComplexNumber(1, 2);
		ComplexNumber obj2=new ComplexNumber(3, 4);
		
		obj2.addComplexnumbers(obj1);
		obj2.printComplexNumber();
	}
}
