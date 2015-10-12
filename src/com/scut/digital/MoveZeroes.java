package com.scut.digital;

/**
 * @author Administrator
 *
 */
public class MoveZeroes 
{
	 public static void moveZeroes(int[] nums) 
	    {    
		    int j=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i]!=0)
	            {
	                nums[j]=nums[i];
	                j++;
	            }
	        }
	        
	        for(;j<nums.length;j++)
	        {
	            nums[j]=0;
	        }
	    }
	 
	 
	 public static void main(String[] args)
	 {
	 	
		 int []nums={0,0,2,5,0,1,2};
		 moveZeroes(nums);
		 for(int i=0;i<nums.length;i++)
			 System.out.println(nums[i]);
	 }
	 
}
