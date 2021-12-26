package arrays;

import java.util.Arrays;

class Solution1732 {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;

        int[] nums = new int[gain.length + 1];
        nums[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            nums[i + 1] = nums[i] + gain[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Solution1732 s = new Solution1732();

        int arr1[] = {-4, -3, -2, -1, 4, 3, 2};


        //  System.out.println(Arrays.toString(s.largestAltitude(arr1)));

        System.out.println(s.largestAltitude(arr1));
    }


}
