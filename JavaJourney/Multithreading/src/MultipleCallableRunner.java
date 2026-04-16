import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);

		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"), new CallableTask("rana"),
				new CallableTask("Bhalchandra"));

		List<Future<String>> results = executorService.invokeAll(tasks);

		System.out.println("\n Main new CallableTask(\"in28Minutes\") completed");

		for (Future<String> result : results) {
			System.out.println(result.get());
		}

		System.out.println("\n Main completed!");
		executorService.shutdown();

	}

}
