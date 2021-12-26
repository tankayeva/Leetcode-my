package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1940 {

    static class Solution {
        public List<Integer> longestCommomSubsequence(int[][] arrays) {

            List<Integer> res = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < arrays.length; i++) {
                for (int j = 0; j < arrays[i].length; j++) {
                    map.put(arrays[i][j], map.getOrDefault(arrays[i][j], 0) + 1);
                }
            }

            for (int i : map.keySet()) {
                if (map.get(i) == arrays.length)
                    res.add(i);
            }

            return res;

        }
    }


    public static void main(String args[]) {
        Solution s = new Solution();

        int[][] A = {{2, 3, 6, 8}, {1, 2, 3, 5, 6, 7, 10}, {2, 3, 4, 6, 9}}; // {{1,3,4},{1,4,7,9}};
        System.out.println(s.longestCommomSubsequence(A));


    }
}
