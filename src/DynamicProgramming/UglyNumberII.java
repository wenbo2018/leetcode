package DynamicProgramming;

public class UglyNumberII 
{    

	/*
	 * 
	 * *��ά��һ��dp���飬ÿһ��ugly number ������֮ǰ��һ��unly number ����2��3����5�õ���.i2, i3, i5��¼�˷ֱ���˶��ٸ�2�� ���ٸ�3�� ���ٸ�5.
	 *  ͬʱ������Ҳ��index��������֮ǰ��ugly number.�ҳ�dp[i2] *2, dp[i3] *3, dp[i5]*5����С��һ����Ϊ�µ�dp[i],
	 *  ͬʱ������dp[i2] *2, dp[i3] *3, dp[i5]*5����dp[i]��ȵ�index��Ҫ��1.
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
