package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] mi = new int[m];
        int[] mx = new int[n];

        Arrays.fill(mi, Integer.MAX_VALUE);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mi[i] = Math.min(matrix[i][j], mi[i]);
                mx[j] = Math.max(matrix[i][j], mx[j]);

            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mi[i] == mx[j]) {
                    res.add(mx[j]);
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution1380 s = new Solution1380();
        int[][] nums = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        System.out.println(s.luckyNumbers(nums));
    }
}