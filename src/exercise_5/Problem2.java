package exercise_5;

@SuppressWarnings("serial")
class CustomException extends Exception{
	
	String customExceptionString="";
	
	public CustomException(String exString) {
		customExceptionString=exString;
	}
	
	@Override
	public String getMessage() {
		return customExceptionString;
		
	}
}

public class Problem2 {
	public static void main(String[] args) {
		try {
			throw new CustomException("This is an user defined exception");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
