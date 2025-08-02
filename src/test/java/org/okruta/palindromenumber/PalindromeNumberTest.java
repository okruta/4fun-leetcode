package org.okruta.palindromenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeNumberTest {
    private final Solution solution = new Solution();
    private final Solution2 solution2 = new Solution2();
    private final Solution3 solution3 = new Solution3();

    private static Stream<Arguments> testArgs() {
        return Stream.of(
                Arguments.of(0, true),
                Arguments.of(1, true),
                Arguments.of(10, false),
                Arguments.of(121, true),
                Arguments.of(120, false),
                Arguments.of(1221, true),
                Arguments.of(12321, true),
                Arguments.of(123421, false),
                Arguments.of(-121, false),
                Arguments.of(-1221, false)
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

    @ParameterizedTest(name = "Solution2 for input = {0} is {1} ")
    @MethodSource("testArgs")
    public void shouldReturnPalindromeNumberForSolution2(int input, boolean expected) {
        // When
        boolean result = solution2.isPalindrome(input);

        // Then
        assertThat(result)
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "Solution3 for input = {0} is {1} ")
    @MethodSource("testArgs")
    public void shouldReturnPalindromeNumberForSolution3(int input, boolean expected) {
        // When
        boolean result = solution3.isPalindrome(input);

        // Then
        assertThat(result)
                .isEqualTo(expected);
    }
}