package string;

import Tree._100;

import java.util.Stack;

public class _1003 {

    static class Solution {
        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == 'c') {
                    if (stack.isEmpty() || stack.pop() != 'b') {
                        return false;
                    }
                    if (stack.isEmpty() || stack.pop() != 'a') {
                        return false;
                    }

                } else {
                    stack.push(c);
                }
            }
            return stack.isEmpty();

        }
    }


    public static void main(String args[]) {
        Solution s = new Solution();


        System.out.println(s.isValid("abcabcababcc"));


    }

}
