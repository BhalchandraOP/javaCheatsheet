package functionalProgramming;

import java.util.List;

public class LambdaBehindScencesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List.of(23, 43, 56, 43).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));
	}

}
