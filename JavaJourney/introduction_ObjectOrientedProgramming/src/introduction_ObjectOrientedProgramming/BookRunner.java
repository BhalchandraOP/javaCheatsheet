package introduction_ObjectOrientedProgramming;

public class BookRunner {
	public static void main(String[] args) {
		// Create a new class called Book
		// Create three instances
//		Book artOfComputerProgramming = new Book();
//		Book effectiveJava = new Book();
//		Book cleanCode = new Book();
//
//		artOfComputerProgramming.method();
//		effectiveJava.method();
//		cleanCode.method();

//		cleanCode.noOfCopies = 40;
//		cleanCode.setNoOfCopies(49);
//		System.out.println(cleanCode.getNoOfCopies());

		Book taocp = new Book();
		taocp.setTitle("The Art Of Computer Programming!");
		Book ej = new Book();
		ej.setTitle("Effective Java");
		Book cc = new Book();
		cc.setTitle("Clean Code");
		System.out.println(taocp.getTitle());
		System.out.println(ej.getTitle());
		System.out.println(cc.getTitle());
	}
}
