package Bit_Manipulation;

import Greedy._1647;

public class _190 {

    public static class Solution {
        // you need treat n as an unsigned value
        public int reverseBits(int n) {
            int result = 0;
            for (int i = 0; i < 32; ++i) {
                System.out.println(result << 1 | (n & 1));
                System.out.println("Repet");
                System.out.println(result << 1);
                System.out.println("Repet1");
                System.out.println(n & 1);
                result = result << 1 | (n & 1);

                n >>>= 1;
            }
            return result;
        }


        public static void main(String args[]) {
            Solution s = new Solution();
            System.out.println("Solution: " + s.reverseBits(000000101001010));

        }
    }
}
