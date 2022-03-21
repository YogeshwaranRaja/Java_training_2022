package exercise_5;

public class Problem10 {
	
	public void exceptMethod() throws UserDefinedException{
		throw new UserDefinedException("User defined exception");		
	}
	
	public static void main(String[] args) {
		new Problem10().exceptMethod();
	}
}
