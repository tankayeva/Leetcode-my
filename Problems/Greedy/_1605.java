package Greedy;

public class _1605 {
    //Explnation https://www.youtube.com/watch?v=Z5ItsZUw-js
    class Solution {
        public int[][] restoreMatrix(int[] row, int[] col) {

            int m = row.length, n = col.length;
            int[][] A = new int[m][n];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    A[i][j] = Math.min(row[i], col[j]);
                    row[i] -= A[i][j];
                    col[j] -= A[i][j];
                }
            }
            return A;
        }
    }
}
