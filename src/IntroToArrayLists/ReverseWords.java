package IntroToArrayLists;

public class ReverseWords {
	public static void main(String[] args) {
		
	}

	static String reverse(String word) {
		if (word.length() == 1) {
			return word;
		} else {
			return reverse(word.substring(1)) + word.charAt(0);
		}
	}

}
