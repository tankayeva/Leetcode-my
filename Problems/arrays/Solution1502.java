package arrays;

import java.util.Arrays;

class Solution1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);

        int n = arr[1] - arr[0];

        boolean res = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != n) {
                res = false;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        Solution1502 s = new Solution1502();
        int[] nums = {3, 5, 1};


        System.out.println(s.canMakeArithmeticProgression(nums));
    }
}