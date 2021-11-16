package mx.msosa.utils;

/**
 * Utilities class
 * @author miguelsosa
 * 
 * This class is used to save methods that we are going to use constantly
 *
 */
	

public class Utilities {


	static char[] VOWELS = { 'a', 'e', 'i', 'o', 'u' };
	
	
	/**
	 * isVowel Method
	 * 
	 * Is used to compare a char with all the vowels. 
	 * If the char is a vowel, method will return TRUE value
	 * @param i
	 * @return boolean 
	 */

	public static boolean isVowel(char i) {
		
		for(char vowel : VOWELS) {
			if(vowel == i) {
				return true;
			}
		}
		return false;
	}

	
	/**
	 * rotateArray Method
	 * 
	 * Is used to move the array n positions to right.
	 * @param items
	 * @param iterations
	 * @return
	 */
	public static char[] rotateArray(char[] items, int iterations) {
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
