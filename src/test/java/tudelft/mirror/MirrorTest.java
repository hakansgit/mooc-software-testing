package tudelft.mirror;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {
	private Mirror mirror;
	@BeforeEach
	public void initialize(){
		mirror = new Mirror();
	}
	
	@ParameterizedTest
	@CsvSource({"abXYZba, ab", "abca, a", "aba, aba", 
			    "abXZba, ab", "abba, abba", "abccba, abccba", "a,a"})
	public void allTests(String string, String mirrored) {
		assertEquals(mirrored, mirror.mirrorEnds(string));
	}
	
}
