package mx.msosa.utils;

public class Utilities {

	static char[] VOWELS = { 'a', 'e', 'i', 'o', 'u' };

	public static boolean isVowel(char i) {
		
		for(char vowel : VOWELS) {
			if(vowel == i) {
				return true;
			}
		}
		return false;
	}

	public static char[] rotateArray(char[] items, int iterations) {
		System.out.println(items.length);
		for(int i = 0; i < iterations ; i ++) {
			char first = items[0];
			
			for(int j = 0  ; j < items.length - 1 ; j ++ ) {
				items[j] = items[j + 1];	
			}
			items[items.length - 1] = first;
		}
		return items;
	}

}
