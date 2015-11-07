package Tree;



public class BalancedBinaryTree 
{
	
	public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	public boolean isBalanced(TreeNode root) 
    {
		
		if(root==null)
			return true;
		if(root.left==null&&root.right==null)
			return true;
		if(Math.abs(height(root.left)-height(root.right))>1)
			return false;
		return isBalanced(root.left)&&isBalanced(root.right);
    }

	
	/** 
	* @Title: height 
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* 递归求解每个节点的高度 
	* @param @param root
	* @param @return    设定文件 
	* @return int    返回类型 
	* @throws 
	*/
	public int height(TreeNode root)
	{
		if(root==null)
			return 0;
		return Math.max(height(root.left), height(root.right))+1;
	}
}
