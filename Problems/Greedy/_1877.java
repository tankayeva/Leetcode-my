package Greedy;

import java.util.Arrays;

public class _1877 {

    class Solution {
        public int minPairSum(int[] nums) {

            int sum = 0;
            int max = 0;

            int r = nums.length - 1, l = 0;
            Arrays.sort(nums);

            while (l < r) {
                sum = nums[l] + nums[r];
                l++;
                r--;

                if (max < sum) {
                    max = sum;
                }
            }

            return max;
        }
    }
}
