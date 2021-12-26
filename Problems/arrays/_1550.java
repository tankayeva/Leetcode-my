package arrays;

public class _1550 {

    //using Recursion
    class Solution1 {
        public boolean threeConsecutiveOdds(int[] arr) {
            // int cnt =0;
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] % 2 != 0 && arr[i - 1] % 2 != 0 && arr[i - 2] % 2 != 0) {
                    return true;
                }
            }
            return false;
        }
    }


}
