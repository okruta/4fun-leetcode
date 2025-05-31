package org.okruta.fibonacci;

public class Solution2 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int twoBefore = 0;
        int oneBefore = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = twoBefore + oneBefore;
            twoBefore = oneBefore;
            oneBefore = current;
        }
        return current;
    }
}
