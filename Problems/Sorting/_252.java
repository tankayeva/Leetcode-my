package Sorting;

import java.util.Arrays;

public class _252 {
    class Solution {
        public boolean canAttendMeetings(int[][] intervals) {

            // Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            for (int i = 0; i < intervals.length - 1; i++) {
                if (intervals[i][1] > intervals[i + 1][0]) {
                    return false;
                }
            }
            return true;

        }
    }
}
