package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1122 {

    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            ArrayList<Integer> arr = new ArrayList<>();
            Set<Integer> set = new HashSet<>();
            Arrays.sort(arr1);

            int[] res = new int[arr1.length];
            int cnt = 0;
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (arr2[i] == arr1[j]) {
                        res[cnt] = arr1[j];
                        cnt++;
                    }
                }
            }

            for (int i = 0; i < arr2.length; i++) {
                set.add(arr2[i]);
            }

            for (int i = 0; i < arr1.length; i++) {
                if (!set.contains(arr1[i])) {
                    res[cnt] = arr1[i];
                    cnt++;
                }
            }

            return res;
        }
    }
}
