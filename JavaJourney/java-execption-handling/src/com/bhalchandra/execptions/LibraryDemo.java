package com.bhalchandra.execptions;

class Library {
	int bookavailable = 3;

	public void Borrowbook(int bookRequestedCount) throws Exception {

		if (bookRequestedCount > bookavailable) {
			throw new Exception("Not enough book present here!"); // This is an Exception object
		}
		if (bookRequestedCount < 0) {
			throw new Exception("Request  at least 1 Book");
		}

	}
}

public class LibraryDemo {
	public static void main(String[] args) {
		Library library = new Library();
		try {
			library.Borrowbook(-1);
		} catch (Exception e) {
			{
				e.getStackTrace();
//				System.out.println(e.getMessage());

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
