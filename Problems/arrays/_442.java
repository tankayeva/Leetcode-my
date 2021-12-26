package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _442 {

    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            ArrayList<Integer> list = new ArrayList<>();
            Arrays.sort(nums);

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    list.add(nums[i]);

                }
            }

            return list;
        }
    }
}
