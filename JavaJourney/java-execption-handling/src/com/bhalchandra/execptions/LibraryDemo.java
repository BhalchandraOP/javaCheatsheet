package com.bhalchandra.execptions;

class MemberUnavailable extends Exception {

	public MemberUnavailable(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class BookUnavailable extends Exception {

	public BookUnavailable(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}

class Library {
	int bookavailable = 5;

	public void Borrowbook(int bookRequestedCount, String member) throws Exception {

		if (bookRequestedCount > bookavailable) {
			throw new BookUnavailable("Not enough book present here!"); // This is an Exception object
		}
		if (bookRequestedCount < 0) {
			throw new Exception("Request  at least 1 Book");
		}
		if (member == null || member.isEmpty()) {
			throw new MemberUnavailable("Unvalid Member entry! ");
		}
		System.out.println("THANK YOU!");

	}
}

public class LibraryDemo {
	public static void main(String[] args) {
		Library library = new Library();
		try {
			library.Borrowbook(3, " d");

		} catch (MemberUnavailable e) {

			System.out.println(e.getMessage());
		} catch (BookUnavailable e) {

			e.printStackTrace();
		} catch (Exception e) {
			{

				System.out.println(e.getMessage() + " " + e.getStackTrace());

			}
		}
	}

}

//try {
//	if (bookRequestedCount > bookavailable) {
//		throw new Exception("Not enough book present here!"); // This is an Exception object
//	}
//} catch (ArrayIndexOutOfBoundsException e) {
//	System.out.println("Required Book is Out of Reach.");
//} catch (NullPointerException e) {
//	System.out.println("Null pointer");
//} catch (Exception e) {
//	System.out.println(" exception");
////	e.printStackTrace();
//} finally {
//	System.out.println("THANK YOU FOR COMING FINALLY BLOCK");
//}

/*
 * public void Borrowbook(int bookRequestedCount) { try { int[] Books = { 101,
 * 102, 103 }; System.out.println("Book Reuqestd :" +
 * Books[bookRequestedCount]);
 * 
 * } catch (ArrayIndexOutOfBoundsException e) {
 * System.out.println("Required Book is Out of Reach."); }
 * catch(NullPointerException e) { System.out.println("Null pointer"); } finally
 * { System.out.println("THANK YOU FOR COMING FINALLY BLOCK"); }
 * 
 * }
 */
