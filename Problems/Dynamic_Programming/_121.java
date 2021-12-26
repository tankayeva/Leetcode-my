package Dynamic_Programming;

public class _121 {

    class Solution {
        public int maxProfit(int[] prices) {
            int minprice = Integer.MAX_VALUE;

            int maxprofit = 0;

            for (int i = 0; i < prices.length; i++) {
                if (minprice > prices[i]) {
                    minprice = prices[i];
                } else if (prices[i] - minprice > maxprofit) {
                    maxprofit = prices[i] - minprice;
                }

            }
            return maxprofit;
        }
    }
}
