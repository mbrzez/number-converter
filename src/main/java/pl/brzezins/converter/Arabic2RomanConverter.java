package pl.brzezins.converter;

import java.util.Stack;

public class Arabic2RomanConverter implements NumberConverter<String, Integer> {
    public String convert(Integer number) {
        int n = number;
        String result = new String();
        Stack<Integer> numbers = new Stack<>();

        do {
            numbers.add(n % 10);
        } while ((n = n / 10) != 0);

        while (numbers.size() != 0) {
            result += getRomanForDecimal(numbers.size() * numbers.pop());
        }

        return result;
    }

    private String getRomanForDecimal(int decimal) {
        return "X";
    }
}
