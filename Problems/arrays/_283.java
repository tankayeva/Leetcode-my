package arrays;

public class _283 {

    class Solution {
        public void moveZeroes(int[] nums) {

            int cnt = 0;

            for (int num : nums) {
                if (num != 0) {
                    nums[cnt++] = num;
                }
            }

            for (int i = cnt; i < nums.length; i++) {
                nums[i] = 0;
            }

        }

    }
}
