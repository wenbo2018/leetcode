package Tree;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Tree.FlattenBinaryTreetoLinkedList.TreeNode;
import sun.reflect.generics.tree.Tree;

public class ConvertSortedArraytoBinarySearchTree 
{

	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	public TreeNode sortedArrayToBST(int[] nums)
    {
        int len=nums.length;
        if(len>0)
        	return  buileTree(nums, 0, len-1);
        else
        	return null;
        	
    }
	
	public TreeNode buileTree(int nums[],int left,int right)
	{
		if(left>right)
			return null;
		int mid=(left+right)/2;
		TreeNode root=new TreeNode(nums[mid]);
		root.left=buileTree(nums, left, mid-1);
		root.right=buileTree(nums, mid+1, right);
		return root;
	}
	
	@Test
	public void Test()
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		System.out.println(list.get(0));
	}
	
}
