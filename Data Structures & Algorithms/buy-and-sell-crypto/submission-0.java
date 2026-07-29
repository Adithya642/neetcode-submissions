/*
Fix the buying price and search for the selling price on the right side of that index and store the maximum profit we can able to get from that buying price - the maximum 
value in the profit array would give the maximum profit -TC- O(n2)
new Approach - buying price should be minimum and selling price should be maximum I will take 2 pointers if the selling price is lower than buying I will make my
 selling price as my buying price and move my selling pointer
*/
class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length ==1 || prices.length==0) return 0;
         int bPrice=0;
         int sPrice=1;
         int maxProfit=0;
         while(sPrice<prices.length){
            if(prices[bPrice]<prices[sPrice]){ 
                maxProfit=Math.max(maxProfit,prices[sPrice]-prices[bPrice]);
            }
            else  {
                bPrice=sPrice ;
            }
            sPrice++;
         }
         return maxProfit;
    }
}
/*
[10,1,5,6,7,1] -6
bPrice=0,sPrice=1 
1<6 - bPrice=1,sPrice=2 
2<6 - maxProfit=4 , sPrice=3
3<6 - maxProfit = 5 , sPrice=4
4<6 -maxProfit = 6, sPrice=5 
5<6 -sPrice=6 - return 6 
*/