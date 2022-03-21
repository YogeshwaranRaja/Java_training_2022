package exercise_5;

public class Problem1 {
	public static void main(String[] args) {
		try {
			throw new Exception("This is a thrown exception");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("I was inside the finally bock");
		}
	}
}
