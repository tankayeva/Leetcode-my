package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _2150 {

    class Solution {
        public List<Integer> findLonely(int[] nums) {

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            List<Integer> res = new ArrayList<>();
            for (int i : nums) {
                if (map.get(i) == 1 && !map.containsKey(i - 1) && !map.containsKey(i + 1)) {
                    res.add(i);
                }
            }
            return res;
        }
    }
}
