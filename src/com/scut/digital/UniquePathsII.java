package com.scut.digital;

import org.junit.Test;

public class UniquePathsII 
{
    
	public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
		int m=obstacleGrid.length,n=obstacleGrid[1].length;
		int i=0,j=0;
        int [] dp=new int[n];
		for(i=0;i<m;i++)
		{
			if(obstacleGrid[i][0]==0)
				dp[i]=1;
		}
		
		for(i=0;i<m;i++)
		{
			for(j=1;j<n;j++)
			{
				if(obstacleGrid[i][j]==1)
					dp[j]=0;
				else
					dp[j]=dp[j]+dp[j-1];
			}
		}
		
        return dp[n-1];
    }
	 @Test
	public void Test()
	{
		 int[][] res = new int[10][10];  
		 System.out.println(res[5][5]);
	}
}
