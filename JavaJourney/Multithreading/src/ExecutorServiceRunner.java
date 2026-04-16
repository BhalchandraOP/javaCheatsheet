import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() { // SIGNATURE
		System.out.println("\n Task" + number + " Started");
		for (int i = number * 101; i <= number * 199; i++) {
			System.out.printf("%d ", i);
			// Thread.yield(); //
		}
		System.out.println("\n Task" + number + " Done!");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		// THis will allow us to execute single thread at a time .
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));

//		executorService.execute(new Thread(new Task2()));
		executorService.shutdown();

//		System.out.println("\n Task3 kicked off!");
//		// Task3
//		for (int i = 301; i <= 399; i++) {
//			System.out.printf("%d ", i);
//		}
//
//		System.out.println("\n Task3 Done!");
//
//		System.out.println("\n Main Done!");

	}

}
