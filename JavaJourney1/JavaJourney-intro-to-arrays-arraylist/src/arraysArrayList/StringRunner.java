package arraysArrayList;

public class StringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] Week = { "Sunday", "Monday", "Tuesda", "Wednesday", "Thusday", "Friday", "Saturday" };

		/*
		 * Find the day with most numer of letters in it - iske liye sare Stringarray
		 * element ko check karke find karna pdega - So sabse small string size ko sare
		 * elem se compare karke karenge !!
		 */
		String dayWithMaxNoOfLetters = "";
		for (String day : Week) {
			if (day.length() > dayWithMaxNoOfLetters.length()) {
				dayWithMaxNoOfLetters = day;
			}
		}
		System.out.println("Day with Most number of Letters in it : " + dayWithMaxNoOfLetters);

		for (int i = Week.length - 1; i >= 0; i--) {
			System.out.println(Week[i]);
		}
	}
}
