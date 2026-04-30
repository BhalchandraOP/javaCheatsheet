package onlyCoding;

public class Pyramide_Pattern {

	public static void pyramid(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = n - 1; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 5;
		pyramid(p);
		// Here i don't need to do pyramid py = new pyramid(p);
		// Since i have single file contains main runner file only.

	}

}
