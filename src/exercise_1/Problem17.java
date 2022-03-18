package exercise_1;

public class Problem17 {
	static final int val=12;
	
	Problem17(int val){
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		val=15;
		Problem17 objExercise17=new Problem17();
	}
}
