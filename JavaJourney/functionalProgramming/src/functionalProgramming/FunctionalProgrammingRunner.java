package functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
//		printBasicWithFiltering(list);
//		printWithFP(list);
		printWithFPWithFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printBasicWithFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

	private static void printWithFP(List<String> list) {
//		element -> System.out.println("element - " + element) - this is called as lamda expression
		list.stream().forEach(element -> System.out.println("elemnt - " + element));

	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at"))
// Above method is called as Intermediate method becoz here the result is also a string or same type to stream 
				.forEach(element -> System.out.println("element - " + element));
// Above is terminal operation where we give a output from a stream ,we re giving result one 
	}

}
