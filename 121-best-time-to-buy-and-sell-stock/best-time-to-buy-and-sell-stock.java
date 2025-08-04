class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0]; // at first we assume it's the first element
        int maxProfit = 0;

        for(int i=0; i < prices.length; i++){ //loop through the days
            int dayPrice = prices[i]; 

            if(dayPrice < minPrice){ //compare between the current day and the minprice we have
                minPrice = dayPrice;
            } else {
                int profit = dayPrice - minPrice; //calculate the profit
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}