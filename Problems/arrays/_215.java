package arrays;

import java.util.Arrays;

public class _215 {

    //my brute force solution, but need to see more efficient ones
    class Solution {
        public int findKthLargest(int[] nums, int k) {


            Arrays.sort(nums);
            int res = 0;
            int i = nums.length - 1;
            int n = k;

            while (n > 0) {
                res = nums[i];
                i--;
                n--;

            }
            return res;
        }
    }
}
