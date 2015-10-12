package com.scut.digital;

public class AvgAge 
{
    public int  avgAge(int n,int y,int w,int x)
    {  
    	int avg=y;
    	for(int i=0;i<n;i++)
    	{
    		avg=(avg+1)*(1-x)*w+21*(1-x)*w;
    	}
    	return avg;
    }
	
}
