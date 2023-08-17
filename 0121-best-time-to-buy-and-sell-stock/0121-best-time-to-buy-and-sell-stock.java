class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0; // initial profit
        int diff = 0;
        int buy_price = prices[0];
        for(int i=1;i<prices.length;i++)
        {
            diff = prices[i] - buy_price;
            profit = Math.max(profit,diff);
            buy_price = Math.min(buy_price,prices[i]);
        }
        return profit;
    }
}