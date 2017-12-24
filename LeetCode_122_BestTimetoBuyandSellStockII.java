/**
 * Created by wanglifei on 2017/12/23.
 */
public class LeetCode_122_BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                res += prices[i + 1] - prices[i];
            }
        }
        return res;
    }
}
