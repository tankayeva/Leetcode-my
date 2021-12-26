package arrays;

public class _1995 {

    class Solution {
        public int countQuadruplets(int[] nums) {
            int count = 0;
//        Here we started a loop for getting quadruplets at proper posotion
            for (int i = 0; i < nums.length - 2; i++) {
//        Here we are using j to get 2nd number of quadruplets
                for (int j = i + 1; j < nums.length - 1; j++) {
//        Here we are using k to get 3rd number of quadruplets
                    for (int k = j + 1; k < nums.length; k++) {
//        Here we are using l to get 4th number of quadruplets
                        for (int l = k + 1; l < nums.length; l++) {
//        Here we are checking if it is a quadruplet or not
                            if (nums[l] == nums[i] + nums[j] + nums[k]) count++;
                        }
                    }
                }
            }

            return count;
        }
    }
}
