package pl.brzezins.converter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Arabic2RomanConverterTest {
    Arabic2RomanConverter arabicConverter;

    @BeforeEach
    void initialize() {
        arabicConverter = new Arabic2RomanConverter();
    }

    @ParameterizedTest
    @MethodSource("pl.brzezins.arguments.ConverterArguments#convertTestArgs")
    void convertTest(String romanNumber, int arabicNumber) {
        assertEquals(romanNumber, arabicConverter.convert(arabicNumber));
    }

    @ParameterizedTest
    @ValueSource(ints = {-4600, -2, 4001, 10003})
    void convertThrowsException(int arabicNumber) {
        assertThrows(IllegalArgumentException.class, () -> arabicConverter.convert(arabicNumber));
    }
}
