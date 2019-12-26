package be.durvenproeven.nielskarl;

import org.apache.commons.lang.StringUtils;

public class StringCalculator {
    public static int add(String s) {
        if (s == null || s.equals("")) {
            return 0;
        }

        if (s.startsWith("//")) {
            String newDelimiter = s.substring(2, 3);
            String content= StringUtils.substringAfter(s, "\n");

            return sum(content, createRegexForDelimiters(newDelimiter, "\n"));
        } else {
            String delimiters = createRegexForDelimiters(",","\n");

            return sum(s, delimiters);
        }
    }

    private static String createRegexForDelimiters(String s1, String s2) {
        return "["+s1+","+s2+"]";
    }

    private static int sum(String s, String delimiters) {
        String[] split = s.split(delimiters);
        int sum = 0;
        for (String numberString : split) {
            sum += Integer.parseInt(numberString);
        }
        return sum;
    }
}
