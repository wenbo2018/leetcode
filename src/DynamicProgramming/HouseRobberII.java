package DynamicProgramming;

public class HouseRobberII 
{
	
	/**�������ٵ�һ�ҵ������ڶ��ұ��������ֵ���������ٵڶ��ҵ����һ�ң���󷵻��������ٵ����ֵ���ɡ�
	 * @param nums
	 * @return
	 */
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
        //�ӵ�һ�ҵ������ڶ���
        for(int i=2;i<nums.length-1;i++)
        {
        	maxSum[i]=Math.max(maxSum[i-2]+nums[i], maxSum[i-1]);
        }
        int temp=maxSum[nums.length-2];
        
        maxSum[1]=nums[1];
        maxSum[2]=Math.max(nums[2], nums[1]);
        //�ӵڶ��ҵ����һ��
        for(int i=3;i<nums.length;i++)
        {
        	maxSum[i]=Math.max(maxSum[i-2]+nums[i], maxSum[i-1]);
        }
        
        return Math.max(temp, maxSum[nums.length-1]);
        
    }
}
