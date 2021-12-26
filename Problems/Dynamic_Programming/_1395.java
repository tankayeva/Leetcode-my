package Dynamic_Programming;

import Matrix._48;

//Explanation
// https://leetcode.com/problems/count-number-of-teams/discuss/555441/JavaC%2B%2B-100-O(N2)-Easy-To-Understand-With-Explanation
public class _1395 {

    static class Solution {
        public int numTeams(int[] rating) {

            int n = rating.length;
            int res = 0;

            for (int i = 0; i < n; i++) {
                int leftIncrease = 0, leftDecrease = 0;
                int rightIncrease = 0, rightDecrease = 0;

                for (int j = 0; j < i; j++) {
                    if (rating[j] < rating[i])
                        leftIncrease++;
                    if (rating[j] > rating[i])
                        leftDecrease++;
                }

                for (int j = i + 1; j < n; j++) {
                    if (rating[i] < rating[j])
                        rightIncrease++;
                    if (rating[i] > rating[j])
                        rightDecrease++;
                }

                res += leftIncrease * rightIncrease + leftDecrease * rightDecrease;
            }

            return res;
        }
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        int[] matrix = {2, 5, 3, 4, 1};
        s.numTeams(matrix);
        // System.out.println(matrix.length);


    }


}
