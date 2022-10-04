package arrays;


/*You might initially think we need to try all possibilities, possibly using dynamic programming. But the question is an "easy" for a reason.

The key observation here is that it's free to move a chip from an even number to another even number, and it is free to move a chip from an odd number to another odd number. It only costs to move an even to an odd, or an odd to an even. Therefore, we want to minimise such moves.

All chips must be on the same position once we're done, which is either even or odd. Therefore, we want to calculate whether it is cheaper to move all the odd chips to even or all the even chips to odd. This will simply come down to how many even chips we start with, and how many odd chips. Each chip that has to be moved will cost exactly 1.

To determine the cost, we need to count how many are even, and how many are odd, and then take the minimum of these two values.
*/

class Solution1217 {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        return Math.min(even, odd);
    }

    public static void main(String[] args) {
        Solution1217 s = new Solution1217();
        int[] nums = {3, 5, 1};


        System.out.println(s.minCostToMoveChips(nums));
    }
}
