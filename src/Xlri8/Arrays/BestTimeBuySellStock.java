package Xlri8.Arrays;

public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            int currentProfit = prices[i] - minPrice;
            maxProfit = Math.max(currentProfit, maxProfit);
        }
        return maxProfit;
    }

}
