package org.okruta.palindromenumber;


import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class PalindromeNumberJmh {
    private static final int PALINDROME_NUMBER_TO_TEST = 1234554321;

    private Solution solution;
    private Solution2 solution2;
    private Solution3 solution3;

    @Setup
    public void setUp() {
        solution = new Solution();
        solution2 = new Solution2();
        solution3 = new Solution3();
    }

    @Benchmark
    public void solution(Blackhole bh) {
        bh.consume(solution.isPalindrome(PALINDROME_NUMBER_TO_TEST));
    }

    @Benchmark
    public void solution2(Blackhole bh) {
        bh.consume(solution2.isPalindrome(PALINDROME_NUMBER_TO_TEST));
    }

    @Benchmark
    public void solution3(Blackhole bh) {
        bh.consume(solution3.isPalindrome(PALINDROME_NUMBER_TO_TEST));
    }
}
