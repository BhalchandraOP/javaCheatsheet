package javajourney.loops;

public class WhileNumberPlayer {

	private int limits;

	public WhileNumberPlayer(int limits) {
		// TODO Auto-generated constructor stub
		this.limits = limits;
	}

	public void printSquaresUptoLimit() {
		// TODO Auto-generated method stub
		int i = 1;
		while (i * i < limits) {
			System.out.print(i * i + " ");
			i++;
		}

	}

	public void printCubesUptoLimits() {
		// TODO Auto-generated method stub
		int i = 1;
		while (i * i * i < limits) {
			System.out.print(i * i * i + " ");
			i++;
		}

	}

}
