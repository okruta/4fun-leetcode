package org.okruta.twosums;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TowSumsTest {
    private final Solution solution = new Solution();

    private static Stream<Arguments> testArgs() {
        return Stream.of(
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    @ParameterizedTest(name = "Solution for input = {0} and target = {1} is {2} ")
    @MethodSource("testArgs")
    public void shouldReturnTwoSumsForSolution(int[] input, int target, int[] expected) {
        // When
        int[] result = solution.twoSum(input, target);

        // Then
        assertThat(result)
                .isEqualTo(expected);
    }

}