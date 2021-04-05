package arrays;

import java.util.HashMap;
import java.util.Map;

class Solution1133 {
    public int largestUniqueNumber(int[] A) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
        }

        int max = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                max = Math.max(max, entry.getKey());
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1133 s = new Solution1133();

        int arr1[] = {5, 7, 3, 9, 4, 9, 8, 3, 1};


        System.out.println(s.largestUniqueNumber(arr1));
    }
}