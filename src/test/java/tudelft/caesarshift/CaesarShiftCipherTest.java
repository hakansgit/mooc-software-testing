package tudelft.caesarshift;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
	@ParameterizedTest
	@CsvSource({"abc, 3, def", "xyz, 3, abc"})
	public void allTests(String message, int shift, String ciphered) {
		CaesarShiftCipher cs = new CaesarShiftCipher();
		assertEquals(ciphered, cs.cipher(message, shift));
	}

}
