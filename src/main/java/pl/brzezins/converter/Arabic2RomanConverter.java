package pl.brzezins.converter;

import pl.brzezins.literal.RomanLiteral;
import pl.brzezins.utils.StringUtils;

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
        int factor = 1;

        for (int i = 0; i < position; i++) {
            factor *= 10;
        }

        String literal = "";

        switch (digit) {
            case 1:
            case 2:
            case 3:
                literal = StringUtils.repeat(RomanLiteral.getByValue(factor).getRoman(), digit);
                break;
            case 4:
                literal = RomanLiteral.getByValue(5*factor).getRoman()
                        + RomanLiteral.getByValue(factor).getRoman();
                break;
            case 5:
                literal = RomanLiteral.getByValue(5*factor).getRoman();
                break;
            case 6:
            case 7:
            case 8:
                literal = StringUtils.repeat(RomanLiteral.getByValue(factor).getRoman(), digit % 5)
                        + RomanLiteral.getByValue(5*factor).getRoman();
                break;
            case 9:
                literal = RomanLiteral.getByValue(10*factor).getRoman()
                        + RomanLiteral.getByValue(factor).getRoman();
                break;
        }

        return literal;
    }
}
