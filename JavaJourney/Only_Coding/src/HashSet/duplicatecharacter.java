package HashSet;

import java.util.HashMap;

public class duplicatecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dup = "Mississippi";
		HashMap<Character, Integer> Dup = new HashMap<>(); // character-key , Integer -Value

		for (char ch : dup.toCharArray()) {
			Dup.put(ch, Dup.getOrDefault(ch, 0) + 1);
		}
		for (char k : Dup.keySet()) {
			if (Dup.get(k) > 2) {
				System.out.println(k + " -> " + Dup.get(k));
			}
		}
	}

}
