package src.ArraysProblem;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuyStocks {
    /*
     [7,1,5,3,6,4] OP 5 (6 - 1) = 5


     */
    public int maxProfitBF(int[] arr) {
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }
    /*
    Basically we track of min element each time and compare with each element for the profit
     */
    public int maxProfit(int[] prices) {

        int size = prices.length;

        int minPrice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i < size; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }
        return profit;
    }
}
