package Sliding_Window;

import java.util.HashMap;

public class _340 {

    class Solution {
        public int lengthOfLongestSubstringKDistinct(String s, int k) {

            if (s.length() == 0 || k == 0) return 0;

            int slow = 0;
            int fast = 0;
            int res = 0;

            HashMap<Character, Integer> hm = new HashMap<>();

            while (fast < s.length()) {
                char c = s.charAt(fast);

                hm.put(c, hm.getOrDefault(c, 0) + 1);

                while (hm.size() > k) {
                    char d = s.charAt(slow);

                    if (hm.get(d) == 1) {
                        hm.remove(d);

                    } else {

                        hm.put(d, hm.get(d) - 1);
                    }
                    slow++;
                }
                res = Math.max(res, fast - slow + 1);
                fast++;
            }

            return res;
        }
    }
}
