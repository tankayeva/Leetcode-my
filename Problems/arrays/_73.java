package arrays;

import java.util.HashSet;
import java.util.Set;

public class _73 {

    class Solution {
        public void setZeroes(int[][] nums) {

            Set<Integer> rows = new HashSet<>();
            Set<Integer> cols = new HashSet<>();


            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    if (nums[i][j] == 0) {
                        rows.add(i);
                        cols.add(j);
                    }
                }
            }


            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    if (rows.contains(i) || cols.contains(j)) {
                        nums[i][j] = 0;
                    }

                }
            }

        }
    }
}
