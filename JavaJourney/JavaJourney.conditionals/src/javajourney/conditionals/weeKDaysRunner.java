package javajourney.conditionals;

public class weeKDaysRunner {

	public static void main(String[] args) {
		System.out.println(isWeekDay(3));
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return false;
		case 1:
			return true;
		case 2:
			return true;
		case 3:
			return true;
		case 4:
			return true;
		case 5:
			return true;
		case 6:
			return false;
		}
		return true;

	}
}
