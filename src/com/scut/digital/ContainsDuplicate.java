package com.scut.digital;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ContainsDuplicate
{
	public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
              return true;
        }
        return false;
    }
	
	@Test
	public void Test()
	{
		int[] nums={10};
		System.out.println(containsDuplicate(nums));
	}
}
