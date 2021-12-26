package Greedy;

import java.util.Arrays;

public class _1921 {

    class Solution1 {
        public int eliminateMaximum(int[] dist, int[] speed) {

            int cnt = 0;
            double min = 0.0;

            double[] res = new double[dist.length];

            for (int i = 0; i < dist.length; i++) {
                res[i] = dist[i] * 1.0 / speed[i];
            }

            Arrays.sort(res);

            for (int i = 0; i < res.length; i++) {
                if (res[i] <= min) {
                    break;
                } else {
                    cnt++;
                    min = min + 1.0;
                }
            }

            return cnt;
        }
    }

    // Explanation https://www.youtube.com/watch?v=6QQRayzOTD4
    class Solution2 {
        public int eliminateMaximum(int[] dist, int[] speed) {
            for (int i = 0; i < dist.length; ++i)
                dist[i] = (dist[i] - 1) / speed[i];
            Arrays.sort(dist);
            for (int i = 0; i < dist.length; ++i)
                if (i > dist[i])
                    return i;
            return dist.length;
        }
    }

}
