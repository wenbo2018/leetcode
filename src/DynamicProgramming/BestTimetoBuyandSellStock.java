package DynamicProgramming;

/**
 * @author Administrator
 *Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 */
public class BestTimetoBuyandSellStock 
{  
	/**
	 * @param prices
	 * @return
	 * 设置一个变量保存前面最小值，将最小值与当前值进行比较取最小的，将当前值与之前最小值相减得到当前利润，取当前利润与最大利润中的最导致
	 * 递推式：MinPrices=Math.min(MinPrices,prices[i]);
            MaxProfit=Math.max(MaxProfit,prices[i]-MinPrices);
	 */
	public int maxProfit(int[] prices) 
    {
         if(prices.length<2)
            return 0;
         int MaxProfit=0;
         int MinPrices=prices[0];
         for(int i=1;i<prices.length;i++)
         {
             MinPrices=Math.min(MinPrices,prices[i]);
             MaxProfit=Math.max(MaxProfit,prices[i]-MinPrices);
         }
         return MaxProfit;
    }
}
