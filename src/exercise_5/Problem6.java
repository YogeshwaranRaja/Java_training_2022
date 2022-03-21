package exercise_5;

import java.io.IOException;

public class Problem6 {
	
	public static void exceptionMethod() {
		throw new IOException();
	}
	
	public static void main(String[] args) {
		exceptionMethod();
	}
}
