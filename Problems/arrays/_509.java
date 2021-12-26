package arrays;

public class _509 {

    class Solution1 {
        public int fib(int n) {

            //Appr #1 Recursion
            if (n <= 1) {
                return n;
            }

            return fib(n - 1) + fib(n - 2);


        }
    }

    class Solution2 {
        public int fib(int n) {

            //Appr #1 Recursion
            if (n <= 1) {
                return n;
            }
            if (n == 2) {
                return 1;
            }

            int current = 0;
            int prev1 = 1;
            int prev2 = 1;

            for (int i = 3; i <= n; i++) {
                current = prev1 + prev2;
                prev2 = prev1;
                prev1 = current;
            }
            return current;

        }
    }
}
