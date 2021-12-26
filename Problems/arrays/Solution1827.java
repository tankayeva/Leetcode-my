package arrays;

class Solution1827 {
    public int minOperations(int[] nums) {

        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]) {
                int diff = nums[i - 1] - nums[i];
                cnt = cnt + diff + 1;
                nums[i] = nums[i] + diff + 1;
            }
        }
        return cnt;

    }
}