
public class MultithreadingConcept {

	public static void main(String[] args) {
		Runnable runnable1=()-> {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Child_Thread " + i);
				}
		};
		Thread thread = new Thread(runnable1);
		thread.start();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main_Thread " + i);
		}
	}

}
