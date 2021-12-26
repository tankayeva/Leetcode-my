package Greedy;

public class _1953 {

    class Solution {
        public long numberOfWeeks(int[] nums) {

            long Sn = 0, max = 0;

            for (int i : nums) {
                Sn += i;
                max = Math.max(i, max);
            }

            if (Sn - max >= max)
                return Sn;
            else
                return 2 * (Sn - max) + 1;
        }
    }


}
