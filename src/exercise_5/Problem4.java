package exercise_5;

import java.io.IOException;

@SuppressWarnings("serial")
class CustomException1 extends Exception{
	public CustomException1(String ex) {
		super(ex);
	}
}

public class Problem4 {

	public void f() throws IOException{
		try {
			g();
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw new IOException("This is the second exception");
		}
	}
	
	public void g() throws CustomException1 {
		throw new CustomException1("This is thrown in g()");
	}
	
	public static void main(String[] args) {
		
		try {
			new Problem4().f();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
}
