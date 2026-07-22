package practice.codes;

/*
 *      * 
 *     * *
 * 	  * * *
 * 	   * * 	
 * 		*
 * */
public class prac2 {

	public static void Diamond(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = n - 1; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = n - 1; k >= i; k--) {
				System.out.print(" *");
			}

			System.out.println();
		}
	}

	public static void revStr(String str) {
//		public static void revStr(String[] str) {   ---> For array of strings

		int strlen = str.length();
		String rev = "";
		for (int i = strlen - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println(rev);
	}

	public void rev(String str) { // this is a method
		char[] res = str.toCharArray();
		int i = res.length;
		int left = 0;
		int right = i - 1;
		while (right > left) {
			char temp = res[left];
			res[left] = res[right];
			res[right] = temp;
			left++;
			right--;
		}
		System.out.println("Reversed String: " + new String(res));
	}

	public static void main(String[] args) {
		// Reverse String
//		String str = "Hello";
//		revStr(str);
//		prac2 Rev = new prac2();
//		Rev.rev(str);
		int i = 3;
		Diamond(i);
	}

}
