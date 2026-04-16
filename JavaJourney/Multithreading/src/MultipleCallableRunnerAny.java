import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleCallableRunnerAny {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"), new CallableTask("rana"),
				new CallableTask("Bhalchandra"));

		String results = executorService.invokeAny(tasks);

//		System.out.println("\n Main new CallableTask(\"in28Minutes\") completed");

		System.out.println(results);

//		System.out.println("\n Main completed!");
		executorService.shutdown();

	}

}
