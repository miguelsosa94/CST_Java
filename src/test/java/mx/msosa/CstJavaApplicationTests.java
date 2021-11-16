package mx.msosa;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@AutoConfigureMockMvc
@SpringBootTest
class CstJavaApplicationTests {
	
	
	// Object to create requests and print responses in console
	@Autowired
	MockMvc mock;

	/**
	 * testPigLatin Test Method
	 * Used to execute tests with different parameters
	 * @throws Exception
	 */
	@Test
	void testPigLatin() throws Exception {
		
		mock.perform(get("/translate/happy")).andDo(print());
		mock.perform(get("/translate/child")).andDo(print());
		mock.perform(get("/translate/awesome")).andDo(print());
	}

}
