package Binary_Search;

public class _374 {

    /**
     * Forward declaration of guess API.
     *
     * @param num your guess
     * @return -1 if num is lower than the guess number
     * 1 if num is higher than the guess number
     * otherwise return 0
     * int guess(int num);
     */

    public class Solution {
        public int guessNumber(int n) {
            int low = 1;
            int high = n;

            while (high >= low) {
                int mid = low + (high - low) / 2;
                int res = guess(mid);

                if (res == 0) {
                    return mid;
                } else if
                (res < 0) high = mid - 1;
                else
                    low = mid + 1;
            }
            return -1;
        }

        private int guess(int mid) {
            return 0;
        }
    }
}
