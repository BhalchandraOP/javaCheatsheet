package javaConcept;

public class RevPalindString {

	public static void rev(String s) {
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i); //// TO ACCESS STRING BY CHAR POSITIONS
		}
		System.out.println(s + "- reversed version " + rev);
		;
	}

	public static void revUsingChArray(String se) {
		char[] rev = se.toCharArray();
		int left = 0;
		int right = se.length() - 1;

		while (left < right) {
			char temp = rev[left];
			rev[left] = rev[right];
			rev[right] = temp;
			left++;
			right--;
		}
		System.out.println("Reveresd version -> " + new String(rev)); // Char to String conversion !!
	}

	public static void palindrome(String se) {
		char[] rev = se.toCharArray();
		int left = 0;
		int right = se.length() - 1;
		boolean flag = false;

		while (left < right) {
			char temp = rev[left];
			rev[left] = rev[right];
			rev[right] = temp;
			left++;
			right--;
		}
		if (se.equals(new String(rev))) { // Char to String conversion !!
			flag = true;
			System.out.println("Given word is a palindrome");
		} else {
			System.out.println("No!, Given word is not a palindrome !");
		}

	}

	public static void REV2POINTER(String se) {
		String rev = new StringBuilder(se).reverse().toString();

		System.out.println("Reveresed String -> " + rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "level";
		rev(str);
		revUsingChArray(str);
		REV2POINTER(str);
		palindrome(str);
	}

}
