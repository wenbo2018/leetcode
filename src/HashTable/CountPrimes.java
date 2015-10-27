package HashTable;

import java.util.Arrays;

public class CountPrimes 
{
 
	public int countPrimes(int n) 
    {
		boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        for(int i = 2; i < n; i++)
        {
            if(prime[i])
            {
                // 将i的2倍、3倍、4倍...都标记为非素数
                for(int j = i * 2; j < n; j =  j + i)
                {
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++)
        {
            if(prime[i])
            	count++;
        }
        return count;
    }
}
