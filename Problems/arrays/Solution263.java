package arrays;

import string.Solution1812;

class Solution263 {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        int[] divisors = {2, 3, 5};

        for (int i : divisors) {
            while (n % i == 0) {
                n /= i;
            }
        }
        return n == 1;
    }


    public static void main(String[] args) {
        Solution263 s = new Solution263();
        System.out.println(s.isUgly(6));


    }
}