package mx.msosa.service;

import org.springframework.stereotype.Service;

import mx.msosa.utils.Utilities;

/**
 * CstServiceImpl is the implementation of CstService interface
 * @author miguelsosa
 *
 *Service is the second layer of microservice
 */

@Service
public class CstServiceImpl implements CstService{
public  String translateToPig(String word) {
	
		// All the letters get converted to lowercase to compare with lowercase vowels
		word = word.toLowerCase();
		
		// Convert string to char array to compare every character
		char[] letters = word.toCharArray();
		
		if(Utilities.isVowel(letters[0])) {
			return (String.valueOf(letters)+"way");
		}else {
			if( Utilities.isVowel(letters[1])) {
				letters = Utilities.rotateArray(letters, 1);
			} else {
				letters = Utilities.rotateArray(letters, 2);
			}
			return (String.valueOf(letters)+"ay");
			
		}
		
	}

}
