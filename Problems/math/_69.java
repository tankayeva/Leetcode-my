package math;

public class _69 {

    //Binary Search
    class Solution {
        public int mySqrt(int x) {
            if (x < 2) return x;
            int low = 2;
            int high = x / 2;
            long num;
            int mid;
            while (low <= high) {
                //mid = low + (high-low)/2;
                // "low + (high - low) / 2" is faster than "(low + high) / 2" because the latter one could have integer overflow (becoming negative). that could result infinite loop...
                mid = (low + high) / 2;
                num = (long) mid * mid;

                if (num > x) high = mid - 1;
                else if (num < x) low = mid + 1;
                else return mid;
            }

            return high;
        }
    }
}
