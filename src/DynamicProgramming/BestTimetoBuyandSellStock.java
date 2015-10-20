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
	 * ����һ����������ǰ����Сֵ������Сֵ�뵱ǰֵ���бȽ�ȡ��С�ģ�����ǰֵ��֮ǰ��Сֵ����õ���ǰ����ȡ��ǰ��������������е����
	 * ����ʽ��MinPrices=Math.min(MinPrices,prices[i]);
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
