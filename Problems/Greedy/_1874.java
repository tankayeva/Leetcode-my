package Greedy;

import java.util.Arrays;

public class _1874 {

    class Solution {
        public int minProductSum(int[] nums1, int[] nums2) {
            int n = 0;
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int l = nums1.length - 1;

            for (int i = 0; i < nums1.length; i++) {
                n += (nums1[i] * nums2[l]);
                l--;
            }
            return n;
        }
    }

}
