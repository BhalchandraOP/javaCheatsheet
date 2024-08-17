package introduction_ObjectOrientedProgramming;

public class Book {
	void method() {
		System.out.println("PikaPi!!");
	}

	private int noOfCopies;

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) { // Scoby Duby Do!!
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;

		}
	}

	public void incnoOfCopies(int how) {
		setNoOfCopies(this.noOfCopies += how);
	}

}
