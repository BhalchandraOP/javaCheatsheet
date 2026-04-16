package javajourney.conditionals;

public class weeKDayDeterminer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(determineNameOfDay(2));
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "thusday";
		case 5:
			return "Friday";
		case 6:
			return "Sunday";
		}
		return "Invalid Day";
	}
}
