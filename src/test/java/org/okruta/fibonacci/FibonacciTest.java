package org.okruta.fibonacci;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {
    private final Solution solution = new Solution();
    private final Solution2 solution2 = new Solution2();

    private static Stream<Arguments> fibonacciArgs() {
        return Stream.of(
                Arguments.of(0, 0),
                Arguments.of(1, 1),
                Arguments.of(2, 1),
                Arguments.of(3, 2),
                Arguments.of(4, 3),
                Arguments.of(5, 5),
                Arguments.of(6, 8),
                Arguments.of(7, 13),
                Arguments.of(8, 21),
                Arguments.of(10, 55),
                Arguments.of(20, 6765),
                Arguments.of(40, 102334155)
        );
    }

    @ParameterizedTest(name = "For n = {0}, fibonacci value is = {1}")
    @MethodSource("fibonacciArgs")
    public void shouldReturnForFibForSolution1(int input, int expected) {
        // When
        int fib = solution.fib(input);

        // Then
        assertThat(fib)
                .isEqualTo(expected);
    }

    @ParameterizedTest(name = "For n = {0}, fibonacci value is = {1}")
    @MethodSource("fibonacciArgs")
    public void shouldReturnForFibForSolution2(int input, int expected) {
        // When
        int fib = solution2.fib(input);

        // Then
        assertThat(fib)
                .isEqualTo(expected);
    }
}