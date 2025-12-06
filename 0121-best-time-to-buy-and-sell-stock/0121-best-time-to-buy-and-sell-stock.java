class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int low = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < low){
                low = price;
            }else if(price - low > maxProfit){
                maxProfit = price - low;
            }
        }
        return maxProfit;
    }
}