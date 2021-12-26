package Bit_Manipulation;

public class _191 {

    public class Solution {
        // you need to treat n as an unsigned value
        public int hammingWeight(int n) {

            // Explanation https://www.youtube.com/watch?v=wLHhAHkID9M

            int cnt = 0;
            while (n != 0) {
                n = n & (n - 1);
                cnt++;

            }


        /*
        int cnt =0, mask = 1;

        for (int i=0; i<32; i++){
            if ((n&mask)!=0)
                cnt++;
                mask = mask<< 1;

        } */

            return cnt;
        }
    }
}
