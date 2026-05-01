package javaConcept;

import java.util.HashMap;

//Q4. Count characters in a string
//Input: "aabbbcc"
//Output: {a=2, b=3, c=2}
public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> Char = new HashMap<>();
		String str = "aabbbcc";
		for (char ch : str.toCharArray()) {
			Char.put(ch, Char.getOrDefault(ch, 0) + 1);
		}
		System.out.print(Char);
	}

}
