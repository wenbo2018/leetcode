package DynamicProgramming;

/**
 * @author Administrator
 * Given a m x n grid filled with non-negative numbers, find a path from top left 
 * to bottom right which minimizes the sum of all numbers along its path.
 */
public class MinimumPathSum 
{
    public static int minPathSum(int[][] grid)
    {
    	int column=grid[0].length;
    	int row=grid.length;
    	
    	int dp[][]= new int[row][column];//到达dp[i][j]时的路径；
    	for(int i=0;i<row;i++)
    	{
    		for(int j=0;j<column;j++)
    		{
    			if(i==0)
  			    {
	  			     if(j==0)
	  				 {
	  				     dp[i][j]=grid[i][j];
	  				 }else
	  				 {
	  				     dp[i][j]=dp[i][j-1]+grid[i][j];
	  				 }
      			 }else if(j==0) 
	  			 {
      				dp[i][j]=dp[i-1][j]+grid[i][j];
				 }else 
				 {
					  dp[i][j]=Math.min(dp[i][j-1],dp[i-1][j])+grid[i][j];
				 }
    		}
    	}
    	
    	return dp[row-1][column-1];
    }
}
