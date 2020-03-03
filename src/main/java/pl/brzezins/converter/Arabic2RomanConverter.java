package pl.brzezins.converter;

import java.util.Stack;

public class Arabic2RomanConverter implements NumberConverter<String, Integer> {
    public String convert(Integer number) {
        if (number < 0 || number > 4000) {
            throw new IllegalArgumentException("The number should be between 1 and 4000");
        }

        StringBuilder result = new StringBuilder();

        // Process decimals from back to the top
        for (int i = 0; i < 4; i++) {
            result.append(getRomanLiteral(number % 10, i));
            number /= 10;
        }

        // Then reverse number
        return result.reverse().toString();
    }

    private String getRomanLiteral(int digit, int position) {
        //TODO

        return "X";
    }
}
