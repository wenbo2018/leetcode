package com.scut.digital;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SingleNumberIII 
{
	 public int[] singleNumber1(int[] nums) 
	    {
	        BitSet bitSet=new BitSet(nums.length);
	        
	        
	        for(int i=0;i<nums.length;i++)
	        {
	        	
	        	if(bitSet.get(nums[i])==false)
	        		bitSet.set(nums[i]);
	        	else 
	        		bitSet.clear(nums[i]);
	        }
	        int[]s={0,0};
	        for(int j=0;j<nums.length;j++)
	        {
	        	if(bitSet.get(j)==true)
	        	{
	        		if(s[0]==0)
	        			s[0]=j;
	        		else 
	        			s[1]=j;
	        	}
	        }
	        return s;
	    }
	 
	 public int[] singleNumber(int[] nums) 
	    {
	        int temp=0;
	        int index=0;
	        for(int i=0;i<nums.length;i++)
	        	temp^=nums[i];
	        for(int j=0;j<32;j++)
	        {
	        	if(((temp>>j)&j)==1)
	        	{
	        		index=j;
	        		break;
	        	}
	        }
	        int[] result={0,0};
	        for(int k=0;k<nums.length;k++)
	        {
	        	if(((nums[k]>>index)&1)==1)
	        		 result[0]^=nums[k];
	        	else
	        		result[1]^=nums[k];
	        }
	        return result;
	    }
	 public int[] singleNumber3(int[] nums)
	 {
	        if(nums.length==2&&nums[0]!=nums[1])
	        {
	            return nums;
	        }
	   
	        HashSet<Integer> store=new HashSet<Integer>();
	        HashSet<Integer> result=new HashSet<Integer>();
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            if(!result.add(nums[i]))
	            {
	                result.remove(nums[i]);
	                store.add(nums[i]);
	            }else
	            {
	                if(store.contains(nums[i]))
	                {
	                    result.remove(nums[i]);
	                }
	            }
	        }
	        int[] print=new int[2];
	        print[0]=result.iterator().next();
	        result.remove(result.iterator().next());
	        print[1]=result.iterator().next();
	        return print;
	         
	   }
	 
	 
	 @SuppressWarnings("unused")
	@Test
	 public void Test()
	 {
		 Set<Integer> set=new HashSet<Integer>();
		 int[]a={1,2,3,5,3,2,1,6};
		 int b[]=null;
	     b=singleNumber3(a);
	     System.out.println(b[0]+"-"+b[1]);
	 }

}
