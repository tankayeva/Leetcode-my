package arrays;

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