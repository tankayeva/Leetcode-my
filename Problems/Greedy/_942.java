package Greedy;

import java.util.Arrays;

public class _942 {


    static class Solution {
        public int[] diStringMatch(String s) {

            int[] res = new int[s.length() + 1];
            int[] arr = new int[s.length() + 1];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }


            int l = 0, r = s.length();
            Arrays.sort(arr);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'I') {
                    res[i] = arr[l];
                    l++;
                } else {
                    res[i] = arr[r];
                    r--;

                }
            }
            res[s.length()] = l;
            return res;

        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "IDID";
        System.out.println(Arrays.toString(sol.diStringMatch(s)));
    }
}
