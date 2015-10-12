package com.scut.digital;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SingleNumberII 
{
	 public int singleNumber(int[] nums) 
		{
		    int []index=new int[32];
		    int result=0;
		    for(int i=0;i<32;i++)
		    {
		    	for(int j=0;j<nums.length;j++)
		    	{
		    		index[i]=index[i]+((nums[j]>>i)&1);
		    	    index[i]=index[i]%3;
		    	}
		    	result|=(index[i]<<i);
		    }
		    return result;
		}
	 
	 public int singleNumber1(int[] nums)
	 {
		    Set<Integer> store=new HashSet<Integer>();
	        Set<Integer> result=new HashSet<Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	            if(!result.add(nums[i]))
	            {
	            	result.remove(nums[i]);
	            	store.add(nums[i]);
	            }else 
	            {
					if(store.contains(nums[i]));
					result.remove(nums[i]);
				}
	        }
	        return result.iterator().next();
	 }
	 
	 
	 @Test
	 public void Test()
	 {
		 int[]nums={1,5,6,9,1,5,6,1,5,6};
		System.out.println(singleNumber(nums));
	 }

}
