package DynamicProgramming;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
/**
 * @author Administrator
 *
 */
public class UniquePaths 
{
     
	 /**
	  * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

		The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
		
		How many possible unique paths are there?
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths(int m, int n)
    {
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		dp[i][j]=1;
        	}
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
	
	
	/** �Ż�����
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths2(int m, int n)
    {
       if(m<=0||n<=0)
    	   return 0;
       int []dp=new int[n];
       dp[0]=1;
       for(int i=0;i<m;i++)
       {
    	   for(int j=1;j<n;j++)
    	   {
    		   dp[j]=dp[j]+dp[j-1];
    	   }
       }
       return dp[n-1];
    }
	
	 
	 @Test
	public void Test()
	{
		 
	}
}

