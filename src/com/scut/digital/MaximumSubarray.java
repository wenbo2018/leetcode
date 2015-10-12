package com.scut.digital;

public class MaximumSubarray 
{   
    /**ά��һ���ֲ����ű�����ȫ�����ű���
     * �ֲ����ŵ��ƣ�loc=max(loc+nums[i],nums[]);
     * ȫ�����ŵ��ƣ�glb=max(loc,glb);
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
