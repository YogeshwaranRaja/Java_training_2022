package exercise_5;

import java.io.IOException;

class BaseClass{
	public BaseClass() throws IOException{
		throw new IOException();
	}
}

public class Problem11 {

	public Problem11() {
		try {
			super();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
