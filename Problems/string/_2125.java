package string;

public class _2125 {

    class Solution {
        public int numberOfBeams(String[] bank) {

            int cnt = 0, prev = 0;
            for (String devs : bank) {
                // devs.chars() cost more than O(1) space. - credit to @bharathkalyans.
                // int cur = devs.chars().map(i -> i == '1' ? 1 : 0).sum();
                int cur = 0;
                for (int i = 0; i < devs.length(); ++i) {
                    cur += devs.charAt(i) == '1' ? 1 : 0;
                }
                cnt += prev * cur;
                if (cur > 0) {
                    prev = cur;
                }
            }
            return cnt;

        }
    }
}
