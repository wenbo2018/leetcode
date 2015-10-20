package DynamicProgramming;

import java.util.List;

public class Triangle 
{
	/**思路：设置一dp数组保存从底层到第i层中的最小路径和，初始化dp数组为最低层值，递推式为：dp[j] =triangle.get(i).get(j) + Math.min( dp[j], dp[j+1]);从下往上
	 * 第i层最小路径和等于第i+1层最小路路径和加第i层某个原始；
	 * @param triangle
	 * @return
	 */
	public int minimumTotal(List<List<Integer>> triangle) 
    {
       int len=triangle.size();
       int [] dp=new int[len];//dp[i]表示到达每层第i个元素的路径和，dp[i]=(当前层第i个元素)+(下一层第i个元素和下一层第i+1个元素较小那个)
       
       for(int i=0; i<len; i++)   
           dp[i] = triangle.get(len-1).get(i);  
       //从倒数第二层开始往上遍历
       for(int i=len-2; i>=0; i--) 
       {  
    	    //变量每一层每一个元素，看看从上一次到达该元素时的最小路径
           for(int j=0; j<triangle.get(i).size(); j++) 
           {  
               dp[j] =triangle.get(i).get(j) + Math.min( dp[j], dp[j+1] );                      
           }  
       }  
       return dp[0];
    }
}
