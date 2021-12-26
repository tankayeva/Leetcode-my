package Dynamic_Programming;

public class _70 {
//Explanation https://www.youtube.com/watch?v=5o-kdjv7FD0   8.20 sec

    class Solution1 {
        public int climbStairs(int n) {

            int[] tmp = new int[n];
            if (n < 2) {
                return 1;
            }
            tmp[0] = 1;
            tmp[1] = 2;
            for (int i = 2; i < n; i++) {
                tmp[i] = tmp[i - 1] + tmp[i - 2];
            }
            return tmp[n - 1];
        }


        class Solution2 {

            public int climbStairs(int n) {
                int a = 1, b = 1;
                while (n-- > 0)
                    a = (b += a) - a;
                return a;
            }
        }
    }

}
