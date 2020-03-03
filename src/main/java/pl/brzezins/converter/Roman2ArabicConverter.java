package pl.brzezins.converter;

import pl.brzezins.literal.RomanLiteral;

public class Roman2ArabicConverter implements NumberConverter<Integer, String> {
    public Integer convert(String number) {
        int result = 0;
        int current = 0;
        int next = 0;
        int position = 0;

        while (position < number.length()) {
            current = RomanLiteral.getValueOfChar(number.charAt(position));

            if (position + 1 < number.length()) {
                next = RomanLiteral.getValueOfChar(number.charAt(position + 1));

                if (current >= next) {
                    result = result + current;
                    position++;
                } else {
                    result = result + next - current;
                    position += 2;
                }
            } else {
                result = result + current;
                position++;
            }
        }

        return result;
    }
}
