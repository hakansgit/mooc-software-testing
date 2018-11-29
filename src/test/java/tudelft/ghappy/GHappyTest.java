package tudelft.ghappy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
	@ParameterizedTest
	@CsvSource({"xxggxx, true", "xxgxx, false", "xxggyygxx, false",
				"g, false", "ggasdfdsf, true", "asdfsdfgg, true",
				"gg, true", "asdfg, false"})
	public void allTests(String string, boolean happy) {
		GHappy gh = new GHappy();
		assertEquals(happy, gh.gHappy(string));
	}
}
