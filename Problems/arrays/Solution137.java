package arrays;

import java.util.HashMap;
import java.util.Map;

class Solution137 {
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i : nums) {
            if (map.get(i) == 1) {
                return i;
            }
        }

        return 0;
    }
}