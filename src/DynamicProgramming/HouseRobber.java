package DynamicProgramming;

public class HouseRobber
{
	public int rob(int[] nums)
    {   
		if(nums.length==0)
			return 0;
		if(nums.length==1)
			return nums[0];
		if(nums.length==2)
			return Math.max(nums[0], nums[1]);
        int []maxSum=new int[nums.length];
        maxSum[0]=nums[0];
        maxSum[1]=Math.max(nums[1], nums[0]);
        for(int i=2;i<nums.length;i++)
        {
        	maxSum[i]=Math.max(maxSum[i-2]+nums[i], maxSum[i-1]);
        }
        return maxSum[nums.length-1];
    }
}
