package DynamicProgramming;

public class UglyNumberII 
{    

	/*
	 * 
	 * *是维护一个dp数组，每一个ugly number 都是由之前的一个unly number 乘以2，3或者5得到的.i2, i3, i5记录了分别乘了多少个2， 过少个3， 多少个5.
	 *  同时这三个也是index用来调用之前的ugly number.找出dp[i2] *2, dp[i3] *3, dp[i5]*5中最小的一个设为新的dp[i],
	 *  同时若上面dp[i2] *2, dp[i3] *3, dp[i5]*5有与dp[i]相等的index都要加1.
	 * @param n
	 * @return
	 */
	public int nthUglyNumber(int n) 
    {
        if(n<=0)
        	return 0;
        int[] dp=new int[n+1];
        dp[1]=1;
        int p2=1;
        int p3=1;
        int p5=1;
        
        for(int i=2;i<=n;i++)
        {
        	dp[i]=Math.min(Math.min(dp[p2]*2, dp[p3]*3), dp[p5]*5);
        	
        	if(dp[i]==dp[p2]*2)
        		p2++;
        	if(dp[i]==dp[p3]*3)
        		p3++;
        	if(dp[i]==dp[p5]*5)
        		p5++;
        }
        return dp[n];
    }
	
}
