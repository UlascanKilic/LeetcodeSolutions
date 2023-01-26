class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, buy = 0;

        for (int i = 1; i < prices.length; i++) //buy
        {
            if(prices[i] < prices[buy])
            {
                buy = i;
            }
            profit = Math.max(profit, prices[i] - prices[buy]);
            
        }

        return profit;
    }
}