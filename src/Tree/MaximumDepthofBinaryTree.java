package Tree;

import Tree.SameTree.TreeNode;

public class MaximumDepthofBinaryTree 
{

	public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	
    public int maxDepth(TreeNode root)
    {
        if(root==null)
        	return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}
