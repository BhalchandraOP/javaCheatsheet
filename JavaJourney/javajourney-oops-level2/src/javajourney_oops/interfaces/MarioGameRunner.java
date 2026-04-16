package javajourney_oops.interfaces;

public class MarioGameRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarioGame game = new MarioGame();
//		ChessGame game1 = new ChessGame();
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
