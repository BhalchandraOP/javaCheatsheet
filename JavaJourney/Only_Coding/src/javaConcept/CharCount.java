package javaConcept;

import java.util.HashMap;

//Q4. Count characters in a string
//Input: "aabbbcc"
//Output: {a=2, b=3, c=2}
public class CharCount {

	public static int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		System.out.println(map.get('M'));
		System.out.println(map.get('X'));

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Character, Integer> Char = new HashMap<>();
		String str = "aabbbcc";
//		for (char ch : str.toCharArray()) {
//			Char.put(ch, Char.getOrDefault(ch, 0) + 1);
//		}
//		System.out.print(Char);
		romanToInt(str);
	}

}
