package exercise_5;

@SuppressWarnings("serial")
class UserDefinedException extends Exception{
	public UserDefinedException(String ex) {
		super(ex);
	}
}

public class Problem9 {
	public static void main(String[] args) {
		try {
			throw new UserDefinedException("User defined exception");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
