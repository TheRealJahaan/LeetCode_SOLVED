class Solution {
    public int maxProfit(int[] arr) {
        int maxProfit = 0 ;
        int minPrice = Integer.MAX_VALUE ;

        for(int prices : arr){
            if(prices < minPrice){
                minPrice = prices ;
            }

            if(prices - minPrice > maxProfit){
                maxProfit = prices - minPrice ;
            }
        }
        return maxProfit ;
    }
}