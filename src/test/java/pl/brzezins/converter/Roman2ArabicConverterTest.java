package pl.brzezins.converter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Roman2ArabicConverterTest {
    @ParameterizedTest
    @MethodSource("pl.brzezins.arguments.ConverterArguments#convertTestArgs")
    void convertTest(String romanNumber, int arabicNumber) {
        Roman2ArabicConverter romanConverter = new Roman2ArabicConverter();

        assertEquals(arabicNumber, romanConverter.convert(romanNumber));
    }
}
