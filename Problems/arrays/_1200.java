package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1200 {

    class Solution {
        public List<List<Integer>> minimumAbsDifference(int[] arr) {

            List<List<Integer>> res = new ArrayList<>();

            int min = Integer.MAX_VALUE;

            Arrays.sort(arr);
            for (int i = 0; i < arr.length - 1; i++) {
                int diff = arr[i + 1] - arr[i];

                if (diff < min) {
                    min = diff;
                    res.clear();
                    res.add(Arrays.asList(arr[i], arr[i + 1]));
                } else if (diff == min) {
                    res.add(Arrays.asList(arr[i], arr[i + 1]));
                }

            }


            return res;

        }
    }
}
