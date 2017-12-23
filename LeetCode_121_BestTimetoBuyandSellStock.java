/**
 * Created by wanglifei on 2017/12/23.
 */
public class LeetCode_121_BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length < 1) return 0;
        int profit = 0, buy = prices[0];
        for (int i = 1; i < prices.length; i++)
        {
            if (buy > prices[i]) buy = prices[i];
            else profit = profit < (prices[i] - buy) ? prices[i] - buy : profit;
        }
        return profit;
    }
}
