package study1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Splitter {

	private static final String DEFAULT_SPLIT = ",|:";
	private static final String CUSTOM_SPLIT = "//(.)\n(.*)";
	private static final Pattern SPLIT_KEY_PATTERN = Pattern.compile(CUSTOM_SPLIT);

	public static String[] split(String inputString) {
		if (emptyString(inputString)) {
			throw new NullPointerException("입력값이 없습니다.");
		}
						
		return customSplitCalculator(inputString); // split
	}

	public static String[] customSplitCalculator(String inputString) {
		String[] numbers = inputString.split(DEFAULT_SPLIT);

		Matcher m = SPLIT_KEY_PATTERN.matcher(inputString);
		if (m.find()) {
			String customDelimiter = m.group(1);
			numbers = m.group(2).split(customDelimiter);

		}
		return numbers;
	}
	public static boolean emptyString(String str) {
		if (str == null || str.isEmpty()) {
			return true;
		}
		return false;
	}
}
