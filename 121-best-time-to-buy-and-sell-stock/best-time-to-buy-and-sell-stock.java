class Solution {
    public int maxProfit(int[] prices) {
        int minPrix = prices[0];
        int maxProfit = 0;
        int profit = 0;
        for (int prix : prices) {
            if (prix < minPrix) {
                minPrix = prix;
            } else {
                profit = prix - minPrix;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        } 
        return maxProfit;
    }
}