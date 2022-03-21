package exercise_5;

public class Problem3 {
	
	void sayHii() {
		System.out.println("Hii");
	}
	
	public static void main(String[] args) {
		try {
			Problem3 objProblem3=null;
			objProblem3.sayHii();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
