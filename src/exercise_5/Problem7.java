package exercise_5;

public class Problem7 {
	public static void main(String[] p) {
		Problem7 s = new Problem7();
		s.mth1();
	}

	public void mth1() {
		mth2();
		System.out.println("caller");
	}

	public void mth2() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("catch-mth2");
		} finally {
			System.out.println("finally-mth2");
		}
	}
}
