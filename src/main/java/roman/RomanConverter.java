package roman;

import java.util.HashMap;
import java.util.Map;

public class RomanConverter {
	static char[] numerals = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
	static int[] values = { 1, 5, 10, 50, 100, 500, 1000 };
	static Map<Character, Integer> romans = new HashMap<>();
	static {
		for (int i = 0; i < numerals.length; i++) {
			romans.put(numerals[i], values[i]);
		}
	}

	public int convert(String input) {
		char[] inputChars = input.toCharArray();
		int result = 0;
		for (char c : inputChars)
			if (romans.get(c) == null) {
				System.out.println("not a roman number");
				return -1;
			}

		for (int i = 0; i < inputChars.length - 1; i++) {
			if (romans.get(inputChars[i]) < romans.get(inputChars[i + 1]))
				result -= romans.get(inputChars[i]);
			else
				result += romans.get(inputChars[i]);
		}
		result += romans.get(inputChars[inputChars.length - 1]);

		return result;
	}
}
