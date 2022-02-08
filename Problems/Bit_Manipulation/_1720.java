package Bit_Manipulation;

import java.util.Arrays;

class _1720 {
    public int[] decode(int[] encoded, int first) {

        int n = encoded.length;

        int[] res = new int[n + 1];

        res[0] = first;

        for (int i = 0; i < n; i++) {

            res[i + 1] = encoded[i] ^ res[i];

        }
        return res;
    }

    public static void main(String[] args) {
        _1720 s = new _1720();

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(s.decode(arr, 1)));
    }

}