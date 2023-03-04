public class Stock {
    /*
    You are given an array prices where prices[i] is the price of a given stock on the ith day.
    You want to maximize your profit by choosing a single day to buy one stock and
    choosing a different day in the future to sell that stock.
    Return the maximum profit you can achieve from this transaction.
    If you cannot achieve any profit, return 0.
    Source: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     */
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for (int val : prices) {
            min = Math.min(min, val);
            profit = Math.max(profit, val - min);
        }
        return profit;
    }
    }

