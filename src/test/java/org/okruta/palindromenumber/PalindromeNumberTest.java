package org.okruta.palindromenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {
    private final Solution solution = new Solution();

    private static Stream<Arguments> testArgs() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(1221, true),
                Arguments.of(12321, true),
                Arguments.of(-121, false),
                Arguments.of(-1221, false),
                Arguments.of(10, false)
        );
    }

    @ParameterizedTest(name = "Solution for input = {0} is {1} ")
    @MethodSource("testArgs")
    public void shouldReturnPalindromeNumberForSolution(int input, boolean expected) {
        // When
        boolean result = solution.isPalindrome(input);

        // Then
        assertThat(result)
                .isEqualTo(expected);
    }
}