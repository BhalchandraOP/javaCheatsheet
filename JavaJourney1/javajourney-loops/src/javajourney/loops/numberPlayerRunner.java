package javajourney.loops;

public class numberPlayerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileNumberPlayer player = new WhileNumberPlayer(10);
		player.printSquaresUptoLimit();
		// For limit = 30 , output would be 1 4 9 16 25

		player.printCubesUptoLimits();
		// For limit = 30 , output would be 1 8 27
	}
}
// Typically, We use while loop , When we don't know how many times
// our code will run.