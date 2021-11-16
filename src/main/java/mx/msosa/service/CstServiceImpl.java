package mx.msosa.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import mx.msosa.utils.Utilities;



@Service
public class CstServiceImpl implements CstService{
public  String translateToPig(String word) {
		StringBuilder builder = new StringBuilder();
		word = word.toLowerCase();
		char[] letters = word.toCharArray();
		System.out.println(letters);
		
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
