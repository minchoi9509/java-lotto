package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tokenization {

    private static final String TOKEN_DELIMITER = ",|:";
    private static final Pattern pattern = Pattern.compile("//(.)\n(.*)");

    private static final int DELIMITER_GROUP_NUMBER = 1;
    private static final int EXPRESSION_GROUP_NUMBER = 2;

    public String[] splitExpression(String expression) {
        Matcher matcher = pattern.matcher(expression);
        String delimiter = TOKEN_DELIMITER;

        if (matcher.find()) {
            delimiter = matcher.group(DELIMITER_GROUP_NUMBER);
            expression = matcher.group(EXPRESSION_GROUP_NUMBER);
        }

        return expression.split(delimiter);
    }
}
