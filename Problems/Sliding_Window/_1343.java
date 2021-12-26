package Sliding_Window;

import Bit_Manipulation._190;

import java.util.Arrays;

public class _1343 {


    static class Solution {
        public int numOfSubarrays(int[] a, int k, int threshold) {

            int n = a.length, count = 0;
            int[] prefixSum = new int[n + 1];
            System.out.println("Repet");
            System.out.println(Arrays.toString(prefixSum));

            for (int i = 0; i < n; ++i)
                prefixSum[i + 1] = prefixSum[i] + a[i];

            System.out.println("Repet1");
            System.out.println(Arrays.toString(prefixSum));
            for (int i = 0; i + k <= n; ++i)
                if (prefixSum[i + k] - prefixSum[i] >= k * threshold)
                    System.out.println("prefixSum[i] " + prefixSum[i + k]);

            ++count;
            return count;
        }
    }


    public static void main(String args[]) {
        Solution s = new Solution();

        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3, threshold = 4;
        System.out.println("Solution: " + s.numOfSubarrays(arr, k, threshold));

    }
}
