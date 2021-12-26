package HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _1817 {

    static class Solution {
        public int[] findingUsersActiveMinutes(int[][] logs, int k) {

            int[] res = new int[k];
            Map<Integer, Set<Integer>> map = new HashMap<>();
            for (int[] l : logs) {
                map.putIfAbsent(l[0], new HashSet<>());
                System.out.println(l[0]);
                map.get(l[0]).add(l[1]);
                System.out.println(map.get(l[0]).add(l[1]));
            }
            for (int key : map.keySet()) {
                res[map.get(key).size() - 1]++;
            }
            return res;
        }
    }


    public static void main(String args[]) {
        Solution s = new Solution();
        int[][] logs = {{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}};

        int k = 5;

        System.out.println(s.findingUsersActiveMinutes(logs, k));

    }
}
