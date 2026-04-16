
public class MyChar {

	private char ch;

	public MyChar(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}

	public boolean isVowel() {
		// TODO Auto-generated method stub
		if (ch == 'a' || ch == 'A') {
			return true;
		}
		if (ch == 'e' || ch == 'E') {
			return true;
		}
		if (ch == 'i' || ch == 'I') {
			return true;
		}
		if (ch == 'o' || ch == 'O') {
			return true;
		}
		if (ch == 'u' || ch == 'U') {
			return true;
		}
		return false;
	}

	public boolean isDigit() {
		// TODO Auto-generated method stub
		if (ch >= 48 && ch <= 57) {
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		if (ch >= 65 && ch <= 122) {
			return true;
		}
		return false;
	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub

	}

	public boolean isConsonant() {
//		if (ch >= 65 && ch <= 122) {
//			if (ch == 'a' || ch == 'A') {
//				return false;
//			}
//			if (ch == 'e' || ch == 'E') {
//				return false;
//			}
//			if (ch == 'i' || ch == 'I') {
//				return false;
//			}
//			if (ch == 'o' || ch == 'O') {
//				return false;
//			}
//			if (ch == 'u' || ch == 'U') {
//				return false;
//			}
//			return true;
//		}
//		return false;
		if (isAlphabet() && !isVowel()) {
			return true;
		}
		return false;
	}

}
