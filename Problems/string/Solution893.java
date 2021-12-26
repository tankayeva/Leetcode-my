package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/groups-of-special-equivalent-strings/
class Solution893 {
    public int numSpecialEquivGroups(String[] A) {
        Set<String> set = new HashSet<>();
        for (String s : A) {
            int[] odd = new int[26];
            int[] even = new int[26];
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) odd[s.charAt(i) - 'a']++;
                else even[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(odd) + Arrays.toString(even);
            set.add(key);
        }
        return set.size();
    }

    public static void main(String[] args) {
        Solution893 s = new Solution893();
        String[] A = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        System.out.println(s.numSpecialEquivGroups(A));

/*
        for (String ss : A) {
            int[] odd = new int[26];
            int[] even = new int[26];
            for (int i = 0; i < ss.length(); i++) {
                if (i % 2 == 1) odd[ss.charAt(i) - 'a']++;
                else even[ss.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(odd) + Arrays.toString(even);
          //  System.out.println(Arrays.toString(odd));
          //  System.out.println(Arrays.toString(even));

            System.out.println(key);
        }*/
    }
}
