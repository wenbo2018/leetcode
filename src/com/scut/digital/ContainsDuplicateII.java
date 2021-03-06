package com.scut.digital;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII 
{
	public boolean containsNearbyDuplicate(int[] nums, int k)
    {
        
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
        	if(map.containsKey(nums[i]))
        	{
        		if(Math.abs(map.get(nums[i])-i)<=k)
        		{
        			return true;
        		}else
        		{
        			map.remove(map.get(nums[i]));
        			 map.put(nums[i], i);
        		}
        		   
        	}else
        	{
			    map.put(nums[i], i);	
			}
        }
        return false;
    }
}
