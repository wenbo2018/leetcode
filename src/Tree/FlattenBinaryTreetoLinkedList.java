package Tree;


public class FlattenBinaryTreetoLinkedList 
{

	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	 
    /** 
    * @Title: flatten 
    * @Description: 迭代方法
    * 不断向右遍历右子树，若当前节点有左子树，则找到左子树最最右的那个节点，将该节点的右子树执行当前节点的右孩子，同时将当前节点的又孩子指向当前节点的左孩子：
    * 情况1：若当前节点只有一个左孩子，那么僵当前节点的又孩子指向当前节点的左孩子，当前节点的左孩子的右孩子指向当前节点的右孩子
    * 情况2：若无左节点，那么深入到下一层右孩子；
    * @param @param root    设定文件 
    * @return void    返回类型 
    * @throws 
    */
    public void flatten(TreeNode root) 
    {
        
    	if(root==null)
    		return;
    	while(root!=null)
    	{
    		if(root.left!=null)
    		{
        		TreeNode cur=root.left;
    			while(cur.right!=null)
    				cur=cur.right;
    			cur.right=root.right;
    			root.right=root.left;
    			root.left=null;
    		}
    		root=root.right;
    	}
    	
    }
    
    
    /** 
    * @Title: flatten2 
    * @Description: 递归方法
    * 不断向右孩子进行递归深入，到达当前节点时：若当前节点有左子树，则找到左子树最最右的那个节点，将该节点的右子树执行当前节点的右孩子，同时将当前节点的又孩子指向当前节点的左孩子：
    * 情况1：若当前节点只有一个左孩子，那么僵当前节点的又孩子指向当前节点的左孩子，当前节点的左孩子的右孩子指向当前节点的右孩子
    * 情况2：若无左节点，那么深入到下一层右孩子；
    * @param @param root    设定文件 
    * @return void  返回类型 
    * @throws 
    */
    public void flatten2(TreeNode root) 
    {
        
    	preOrder(root);
    }
    
    public void preOrder(TreeNode root)
    {
    	if(root==null)
    		return;
    	if(root.left!=null)
		{
    		TreeNode cur=root.left;
			while(cur.right!=null)
				cur=cur.right;
			cur.right=root.right;
			root.right=root.left;
			root.left=null;
		}
    	preOrder(root.right);
    }    
}
