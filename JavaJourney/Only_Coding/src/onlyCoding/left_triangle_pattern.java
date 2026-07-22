package onlyCoding;

public class left_triangle_pattern {
	public static void ltp(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j >= i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void left_triangle_pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
//left_triangle_pattern(5);
		ltp(5);
	}

}
