package Matrix;

import Dynamic_Programming._5;

import java.util.Arrays;

//Solution from Leetcode
public class _48 {

    static class Solution {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            for (int i = 0; i < (n + 1) / 2; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = matrix[n - 1 - j][i];
                    System.out.println("Temp: " + matrix[n - 1 - j][i]);
                    matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
                    System.out.println("Temp1: " + matrix[n - 1 - i][n - j - 1]);
                    matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];
                    matrix[j][n - 1 - i] = matrix[i][j];
                    matrix[i][j] = temp;
                }
            }
        }
    }


    public static void main(String args[]) {
        Solution s = new Solution();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        s.rotate(matrix);
        System.out.println(matrix.length);


    }


}
