package pl.brzezins.arguments;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class ConverterArguments {
    private static Stream<Arguments> convertTestArgs() {
        return Stream.of(
                Arguments.of("MCMXCIX", 1999),
                Arguments.of("MMXLV", 2045),
                Arguments.of("CDLXXVII", 477),
                Arguments.of("DCCLXXXIII", 783),
                Arguments.of("MDCX", 1610),
                Arguments.of("LXXI", 71),
                Arguments.of("XXXVIII", 38),
                Arguments.of("MCCCXXVII", 1327),
                Arguments.of("MCDXXIV", 1424),
                Arguments.of("CDXCIV", 494),
                Arguments.of("XLIX", 49)
        );
    }
}
