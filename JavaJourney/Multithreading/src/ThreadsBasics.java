//extends Thread
// implement Runnable
class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\n Task1 Started");
		for (int i = 101; i <= 199; i++) {
			System.out.printf("%d ", i);
			// Thread.yield(); //
		}
		System.out.println("\n Task1 Done!");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\n Task2 Started");
		for (int i = 201; i <= 299; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n Task2 Done!");
	}
}

public class ThreadsBasics {

	public static void main(String[] args) throws InterruptedException {
		// Task1 -101 to 199
		System.out.println("\n task1 kicked off!");
		Task1 task1 = new Task1();
		task1.setPriority(1); // Setting priority -> not like order may be sometime it will avoid
		task1.start();

		// Task2
		System.out.println("\n Task2 Kicked Off!");
		Task2 task2 = new Task2();

		Thread task2thread = new Thread(task2);
		task1.setPriority(6);

// Assure complition of tasks 

		task2thread.start();

		task1.join(); // Task3 method insure the when this complestes then only other task will take
						// place
		task2thread.join();

		System.out.println("\n Task3 kicked off!");

		for (int i = 301; i <= 399; i++) {
			System.out.printf("%d ", i);
		}

		System.out.println("\n Task3 Done!");

		System.out.println("\n Main Done!");
	}

}
