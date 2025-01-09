package DestiantionFang.Arrays;

public class BestTimeToSellStock {

    /*
    7 1 5 3 6 4 o/p 5

    Brute force -> For each value compare and check Keep a variable Profit and keep updating
    O(n2)

    Optimal Approach

    Buy at lowest values and sell at hightest value
    Point ot note since it is stock we can not go back and the day before and sell if suppose u buy on 7th dec
    then you can sell after 7th december or fter tha tieme not before

    So dont update the buy value if we brought at lowest cost and update the Profit if the selling the values is better compare
    to other days

    TC - O(n)
     */
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int profit = 0;

        for(int i = 0 ; i < prices.length ; i++) {

            if(prices[i] < min) {
                min = prices[i];
            }

            profit = Math.max(profit,prices[i] - min);
        }

        return profit;
    }

}
