package mx.msosa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mx.msosa.service.CstService;

@RestController
public class CstController {
	
	@Autowired
	CstService service;
	
	
	/* Pig Latin Controller
	 * Controller is the first layer of a microservice, this class will interact with frontend side.
	 */
	@GetMapping(value="translate/{word}", produces=MediaType.TEXT_PLAIN_VALUE)
	public String pigLatin(@PathVariable("word") String englishWord) {
		
		return service.translateToPig(englishWord);
		
	}

}
