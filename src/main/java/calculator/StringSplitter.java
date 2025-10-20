package calculator;

import java.util.Arrays;

public class StringSplitter {
    private static final String[] basic = {",", ":"};

    public String[] split(String input) {

        if (input == null || input.trim().isEmpty()) {
            return new String[]{"0"};
        }

        if (!input.contains("//")) {
            return basicSplit(input);
        }
        return customSplit(input);
    }

    public String[] basicSplit(String input) {
        return input.split("[,:]");
    }

    public String[] customSplit(String input) {
        int customIndex1 = input.indexOf("//");
        int customIndex2 = input.indexOf("\n");
        if (customIndex2 == -1) {
            throw new IllegalArgumentException("형식이 올바르지 않습니다");
        }
        String custom = input.substring(customIndex1 + 2, customIndex2);
        String numbers = input.substring(customIndex2 + 1);
        return numbers.split(custom);
    }
}
