package javajourney_oops.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		ChessGame game1 = new ChessGame();
		game1.up();
		game1.down();
		game1.left();
		game1.right();
	}

}
