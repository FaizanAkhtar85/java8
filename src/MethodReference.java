/*interface interf {
	void add(int a, int b);
}*/
class Sample {
	Sample() {
		System.out.println("Sample obj instantiated...");
	}
}

interface Interfac {
	public Sample get();
}

public class MethodReference {

	/*
	 * public void sum(int a, int b) { System.out.println(a + b); }
	 */

	
	  public static void m1() { for (int i = 0; i < 6; i++) {
	  System.out.println("child thread" + i); } }
	 

	public static void main(String[] args) {
		/*
		 * Runnable runnable = () -> { for (int i = 0; i < 6; i++) {
		 * System.out.println("child thread" + i); } };
		 */
		
		  Runnable runnable = MethodReference::m1; Thread thread = new
		  Thread(runnable); thread.start(); for (int i = 0; i < 6; i++) {
		  System.out.println("Main thread" + i); }
		 

		/*
		 * interf f = (a, b) -> System.out.println(a + b); f.add(5, 8);
		 */
		/*
		 * MethodReference mrMethodReference = new MethodReference();
		 * 
		 * interf f = mrMethodReference::sum; f.add(5, 8);
		 */

		Interfac interf = Sample::new;
		Sample s = interf.get();

	}

}
