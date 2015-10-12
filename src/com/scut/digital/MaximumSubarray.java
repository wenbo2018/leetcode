package com.scut.digital;

public class MaximumSubarray 
{   
    /**维护一个局部最优变量跟全局最优变量
     * 局部最优递推：loc=max(loc+nums[i],nums[]);
     * 全部最优递推：glb=max(loc,glb);
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) 
    {if(nums.length==1)
    	return nums[0];
    int  loc=nums[0];
    int  glb=nums[0];
    for(int i=1;i<nums.length;i++)
    {
    	loc=Math.max(loc+nums[i], nums[i]);
    	glb=Math.max(glb, loc);
    }
    return glb;
    }
}
