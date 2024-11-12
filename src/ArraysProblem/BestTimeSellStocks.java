package ArraysProblem;

public class BestTimeSellStocks {
    /*
   Basically we track of min element each time and compare with each element for the profit
    */  
    public int maxProfit(int[] prices) {

        int n = prices.length;
        int minProfit = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0 ; i < n ; i++) {
            minProfit = Math.min(minProfit, prices[i]);
            profit = Math.max(profit, prices[i] - minProfit);
        }
        return profit;
    }
}
