package Binary_Search;


// Explanation https://www.youtube.com/watch?v=Sp2sRLcLND0
public class _875 {

    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int max = Integer.MIN_VALUE;

            for (int pile : piles) {
                max = Math.max(max, pile);
            }

            int left = 1, right = max;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (canEatInTime(piles, mid, h)) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return left;

        }

        private boolean canEatInTime(int[] piles, int k, int h) {
            int hours = 0;

            for (int pile : piles) {
                int div = pile / k;
                hours += div;

                if (pile % k != 0)
                    ++hours;
            }
            return hours <= h;
        }
    }


}
