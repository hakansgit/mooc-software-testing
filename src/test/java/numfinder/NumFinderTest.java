package numfinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import tudelft.numfinder.NumFinder;

public class NumFinderTest {
	@Test
	public void descendingTest() {
		NumFinder nf = new NumFinder();
		nf.find(new int[] {4,3,2,1});
		
		assertEquals(4, nf.getLargest());
		assertEquals(1, nf.getSmallest());
	}
	
}
