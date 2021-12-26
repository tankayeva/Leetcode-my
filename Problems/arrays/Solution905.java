package arrays;


import java.util.Arrays;

class Solution905 {
    public int[] sortArrayByParity(int[] A) {

        int[] res = new int[A.length];

        int c = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res[c] = A[i];
                c++;
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 1) {
                res[c] = A[i];
                c++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution905 s = new Solution905();

        int[] arr = {3, 1, 2, 4};
        System.out.println(Arrays.toString(s.sortArrayByParity(arr)));
    }

}
