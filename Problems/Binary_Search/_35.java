package Binary_Search;

public class _35 {

    //Approach 1
    class Solution1 {
        public int searchInsert(int[] nums, int target) {
            int cnt = 0;
            int a = 0;

            if (target < nums[0]) {
                cnt = 0;
                a = 1;
            } else if (target > nums[nums.length - 1]) {
                cnt = nums.length;
                a = 1;
            }

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    cnt = i;
                    a = 1;
                }
            }

            for (int i = 0; i < nums.length; i++) {
                if (a == 0 && nums[i] > target) {
                    cnt = i;
                    break;
                }
            }


            return cnt;


        }

        //Approach 2 using Binary Search
        class Solution2 {
            public int searchInsert(int[] nums, int target) {
                int pivot, left = 0, right = nums.length - 1;
                while (left <= right) {
                    pivot = left + (right - left) / 2;
                    if (nums[pivot] == target) return pivot;
                    if (target < nums[pivot]) right = pivot - 1;
                    else left = pivot + 1;
                }
                return left;
            }
        }
    }
}
