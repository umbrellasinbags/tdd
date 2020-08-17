package co.interleap.courses.tdd;

public class VowelCounter {
	private static String VOWELS = "AEIOUaeiou";
	int countNumberOfVowels(String s) {
		int c = 0;
		for (char ch: s.toCharArray()
			 ) {
			if (VOWELS.indexOf(ch) != -1) {
				c+=1;
			}
		}
		return c;
	}
}
