package arrays;

import java.util.Arrays;

class Solution1480 {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res[i] = nums[i] + res[i - 1];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution1480 s = new Solution1480();
        int[] nums = {1, 2, 3, 4};


        System.out.println(Arrays.toString(s.runningSum(nums)));
    }
}

