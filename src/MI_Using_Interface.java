interface Left {
	default void m1() {
		System.out.println("in left method");
	}
}

interface Right {
	default void m1() {
		System.out.println("in Right method");

	}
}

public class MI_Using_Interface implements Left, Right {

	public void m1() {
		Left.super.m1();
		System.out.println("in implement class method");
		//Right.super.m1();
	}

	public static void main(String[] args) {
		MI_Using_Interface tInterface = new MI_Using_Interface();
		tInterface.m1();
	}

}
