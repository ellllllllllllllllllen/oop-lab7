package by.bntu.fitr.zavadskaya.javalabs.lab7.logic;

public class Letter {

	public static boolean isVowel(char letter) {
		return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
	}

	public static boolean isVowel2(String letter) {
		String vowel = "aeiou";
		return vowel.contains(letter);
	}

	public static boolean isVowel3(char letter) {
		switch (letter) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		}
		return false;
	}
}
