package exercise_5;


public class Problem5 {
	String str = "a";

	public static void main(String[] args) {

		Problem5 object = new Problem5();
		object.A();
		object.display();

	}

	void A() {

		try {
			str += "b";
			B();
		} 
		catch (Exception e) {
			str += "c";
		}
	}

	void B() throws Exception {
		try {
			str += "d";
			C();
		} 
		catch (Exception e) {
			throw new Exception();
		} 
		finally {
			str += "e";
		}
		str += "f";

	}

	void C() throws Exception {
		throw new Exception();
	}

	void display() {
		System.out.println(str);
	}
}
