package arrays;

import java.util.HashSet;
import java.util.Set;

//Greedy
public class _1893 {

    static class Solution {
        public boolean isCovered(int[][] ranges, int left, int right) {

            Set<Integer> set = new HashSet<>();

            for (int[] range : ranges) {
                for (int i = range[0]; i <= range[1]; i++) {
                    set.add(i);
                }
            }

            //System.out.println(set);

            for (int i = left; i <= right; i++) {
                if (!set.contains(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] nums = {{1, 50}};
        int left = 1;
        int right = 50;


        System.out.println(s.isCovered(nums, left, right));
    }
}
