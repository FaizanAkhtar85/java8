interface I {
	public static void m1() {
		System.out.println("In I interface");
	}
}

public class StaticMethodInInterface {

	public static void main(String[] args) {
		I.m1();
		/*
		 * m1(); StaticMethodInInterface.m1(); StaticMethodInInterface s = new
		 * StaticMethodInInterface(); s.m1();
		 */

	}
}
