package arrays;

import java.util.Arrays;

class _922 {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];

        int n = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                res[n] = i;
                n += 2;
            }
        }

        int k = 1;
        for (int i : nums) {
            if (i % 2 != 0) {
                res[k] = i;
                k += 2;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        _922 s = new _922();
        int[] nums = {4, 2, 5, 7};


        System.out.println(Arrays.toString(s.sortArrayByParityII(nums)));
    }

}