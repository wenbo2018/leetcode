package DynamicProgramming;

public class MaximumProductSubarray 
{

	public int maxProduct(int[] nums) 
    {
        if(nums.length==1)
           return nums[0];
        
        int locMax=nums[0];
        int locMin=nums[0];
        int glb=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
        	int maxTemp=locMax*nums[i];
        	int minTemp=locMin*nums[i];
        	int temp=nums[i];
        	locMax=Math.max(Math.max(maxTemp, minTemp),temp);
        	locMin=Math.min(Math.min(maxTemp, minTemp), temp);
        	glb=Math.max(locMax, glb);
        }
        return glb;
    }
	
}
