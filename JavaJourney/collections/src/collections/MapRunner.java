package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is an awesome occasion . " + "This has never happen before";

		Map<Character, Integer> occurances = new HashMap<>();

		char[] characters = str.toCharArray();

		for (char chars : characters) {
			// Get the character
			Integer integer = occurances.get(chars);
			if (integer == null) {
				occurances.put(chars, 1);
			} else {
				occurances.put(chars, integer + 1);
			}
		}
		System.out.println(occurances);

		Map<String, Integer> stringoccurances = new HashMap<>();
		String[] words = str.split(" ");

		for (String word : words) {
			// Get the character
			Integer integer = stringoccurances.get(word);
			if (integer == null) {
				stringoccurances.put(word, 1);
			} else {
				stringoccurances.put(word, integer + 1);
			}
		}
		System.out.println(stringoccurances);
	}

}
