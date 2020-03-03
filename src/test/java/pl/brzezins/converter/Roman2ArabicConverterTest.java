package pl.brzezins.converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Roman2ArabicConverterTest {
    Roman2ArabicConverter romanConverter;

    @BeforeEach
    void initialize() {
        romanConverter = new Roman2ArabicConverter();
    }

    @ParameterizedTest
    @MethodSource("pl.brzezins.arguments.ConverterArguments#convertTestArgs")
    void convertTest(String romanNumber, int arabicNumber) {
        assertEquals(arabicNumber, romanConverter.convert(romanNumber));
    }
}
