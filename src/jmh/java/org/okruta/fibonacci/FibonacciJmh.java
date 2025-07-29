package org.okruta.fibonacci;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class FibonacciJmh {
    private static final int FIBONACCI_NUMBER_TO_TEST = 40;

    private Solution solution;
    private Solution2 solution2;

    @Setup
    public void setUp() {
        solution = new Solution();
        solution2 = new Solution2();
    }

    @Benchmark
    public void solution(Blackhole bh) {
        bh.consume(solution.fib(FIBONACCI_NUMBER_TO_TEST));
    }

    @Benchmark
    public void solution2(Blackhole bh) {
        bh.consume(solution2.fib(FIBONACCI_NUMBER_TO_TEST));
    }
}
