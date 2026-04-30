package onlyCoding;

public class right_triangle_pattern {
	public static void rgt_triangle_pattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		rgt_triangle_pattern(5);
	}

}
