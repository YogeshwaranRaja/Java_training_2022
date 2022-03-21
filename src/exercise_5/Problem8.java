package exercise_5;

public class Problem8 {
	public static void main(String[] p) {
		Problem8 s = new Problem8();
		s.mth1();
	}

	public void mth1() {
		mth2();
		System.out.println("caller");
	}

	public void mth2() {
		try {
			System.exit(0);
		} catch (Exception e) {
			System.out.println("catch-mth2");
		} finally {
			System.out.println("finally-mth2");
		}
	}
}
