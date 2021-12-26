package arrays;

import java.util.Stack;

public class _1944 {

    class Solution {
        public int[] canSeePersonsCount(int[] heights) {

            int n = heights.length;
            int[] ans = new int[n];
            Stack<Integer> stack = new Stack<>();
            // start from end
            for (int i = n - 1; i >= 0; i--) {
                // stack contains heights in increasing
                // so, pop heights from stack until you see height >= your height
                // because you cannot see persons after him
                int count = 0;
                while (!stack.isEmpty() && stack.peek() <= heights[i]) {
                    count++;
                    stack.pop();
                }
                // assign count to ans
                ans[i] = count + (stack.isEmpty() ? 0 : 1);
                stack.push(heights[i]);
            }
            return ans;

        }
    }
}
