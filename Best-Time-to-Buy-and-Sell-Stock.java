class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0,minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            minPrice=Math.min(minPrice,prices[i]);
            maxpro=Math.max(maxpro,prices[i]-minPrice);
        }
        return maxpro;
    }
}