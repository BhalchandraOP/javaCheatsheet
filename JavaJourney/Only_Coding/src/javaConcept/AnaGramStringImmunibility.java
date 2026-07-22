package javaConcept;

import java.util.HashMap;

public class AnaGramStringImmunibility {

	public static void hash(String s) {
		System.out.println(s.hashCode());
		s = s.concat(" World");
		System.out.println(s.hashCode());
	}

	public static void anagram(String s1, String s2) {
		HashMap<Character, Integer> ana = new HashMap<>();
		HashMap<Character, Integer> ana1 = new HashMap<>();
		if (s1.length() != s2.length()) {
			System.out.println("No ,they are not");
		} else {
			for (char ch : s1.toCharArray()) {
				ana.put(ch, ana.getOrDefault(ch, 0) + 1);
			}
			for (char ch : s2.toCharArray()) {
				ana1.put(ch, ana1.getOrDefault(ch, 0) + 1);
			}
			if (ana.equals(ana1)) {
				System.out.println("They are anagram pair! ");
			}
		}
	}

	public static void main(String[] args) {

//		String can not be modified , if any modification occurs it get stored in different object !
		String s1 = "listen";
		String s2 = "slent";

		s1.concat("World"); // HERE CONCATE CREATED NEW STRING , BUT DIDNT MENTION THE REFERENCE
		// SINCE WE DIDNT MENTION ANOTHER STRING TO STORE RESULT REFERENCE ,
		// MODIFICATION GET DISCARED!
		// System.out.println(s1);

		// s1 =s1.concat("World"); // in this case the parent // s1 was updated to point
		// to the new object.

		// hash(s1);

		anagram(s1, s2);
	}

}
