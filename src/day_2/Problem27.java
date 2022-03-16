package day_2;

public class Problem27 {
	private double principal;

	public Problem27(int p) {
		principal = p;
	}

	double calculateValue() {
//		first year gets a 40% gain
		principal += principal * .4;
//		Second year losses 1500
		principal -= 1500;
//		third year gets a 12% gain
		principal += principal * .12;
		return principal;
	}
	
	public static void main(String[] args) {
		Problem27 obj=new Problem27(14000);
		System.out.println(obj.calculateValue());
	}
}


