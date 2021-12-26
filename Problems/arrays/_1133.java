package arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class _1133 {
    static class Solution1 {
        public int largestUniqueNumber(int[] A) {

            TreeMap<Integer, Integer> treeMap = new TreeMap<>(Collections.reverseOrder());
            // ((a, b) -> b - a);  alternative for reverse
            for (int num : A) {
                treeMap.put(num, treeMap.getOrDefault(num, 0) + 1);
            }
            for (int key : treeMap.keySet()) {
                if (treeMap.get(key) == 1) {
                    return key;
                }
            }
            return -1;
        }
    }

    class Solution2 {
        public int largestUniqueNumber(int[] A) {
            Map<Integer, Integer> count = new HashMap<Integer, Integer>();
            // Store counts of each element
            for (int i : A) {
                count.put(i, count.getOrDefault(i, 0) + 1);
            }
            int result = -1;
            for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
                // If count of the integer is 1 get maximum.
                if (entry.getValue() == 1) {
                    result = Math.max(result, entry.getKey());
                }
            }
            return result;
        }
    }

    public static void main(String args[]) {
        Solution1 s = new Solution1();
        int[] A = {5, 7, 3, 9, 4, 9, 8, 3, 1};
        System.out.println(s.largestUniqueNumber(A));


    }
}
