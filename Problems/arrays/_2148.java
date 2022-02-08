package arrays;

public class _2148 {

    class Solution {
        public int countElements(int[] nums) {


            int max = nums[0], min =nums[0], cnt=0;
            for (int i : nums){
                if (max < i){
                    max = i;
                }

                if (min > i){
                    min = i;
                }
            }


            for (int i=0; i<nums.length; i++){
                if (nums[i] != max && nums[i]!= min){
                    cnt++;
                }

            }

            return cnt;
        }
    }
}
