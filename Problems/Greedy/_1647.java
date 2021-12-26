package Greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1647 {

    static class Solution {
        public int minDeletions(String s) {

            int[] charCount = new int[26];
            for (char c : s.toCharArray()) {
                charCount[c - 'a']++;
                System.out.println(c - 'a');
                System.out.println("YES: " + charCount[c - 'a']);
                System.out.println("ARRAY: " + Arrays.toString(charCount));
            }

            Set<Integer> set = new HashSet<>();
            int deletions = 0;
            for (int i : charCount) {
                while (i != 0 && set.contains(i)) {
                    deletions++;
                    i--;
                }
                set.add(i);
            }

            return deletions;

        }
    }


    public static void main(String args[]) {
        Solution s = new Solution();


        System.out.println("Solution: " + s.minDeletions("ceabaacb"));


    }
}
