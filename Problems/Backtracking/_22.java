package Backtracking;

import java.util.ArrayList;
import java.util.List;

//BEST Backtracking Explanation https://www.youtube.com/watch?v=s9fokUqJ76A

public class _22 {

    class Solution {
        public List<String> generateParenthesis(int n) {

            List<String> res = new ArrayList<>();
            if (n <= 0) {
                return res;
            }
            StringBuilder sb = new StringBuilder();
            backTracking(n, n, res, sb);
            return res;
        }

        private void backTracking(int left, int right, List<String> res, StringBuilder sb) {
            if (left == 0 && right == 0) {
                res.add(sb.toString());
                return;
            }
            if (left > 0) {
                sb.append("(");
                backTracking(left - 1, right, res, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
            if (right > left) {
                sb.append(")");
                backTracking(left, right - 1, res, sb);
                sb.deleteCharAt(sb.length() - 1);

            }
        }
    }
}
