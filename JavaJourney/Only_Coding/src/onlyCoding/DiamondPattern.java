package onlyCoding;

/*
 *      * 
 *     * *
 * 	  * * *
 * 	   * * 	
 * 		*
 * */
public class DiamondPattern {
	public static void Diamond1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.println(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 0; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.println(" ");
			}
		}
	}

	public static void Diamond(int n) {
		for (int i = 1; i <= n; i++) {
			// Spacing
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			// Printing
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Diamond(n = 5);
		Diamond1(n = 5);
	}

}
