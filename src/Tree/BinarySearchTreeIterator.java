package Tree;

import java.util.Stack;

import Tree.BinaryTreeInorderTraversal.TreeNode;

public class BinarySearchTreeIterator
{

    
	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	 
	 
	     Stack<TreeNode> s=new Stack<TreeNode>();
	    
	    /** 
	    * @Title: BSTIterator 
	    * @Description: TODO(这里用一句话描述这个方法的作用) 
	    * 维护一个栈，按照中序遍历思想，不断将初始化时不断左孩子入栈直到为左孩子为null，next()时，将当前top值返回，同时判断当前值得右孩子是否为null，不为null就一到右孩子然后继续左孩子入栈
	    * @param @param root    设定文件 
	    * @return void    返回类型 
	    * @throws 
	    */
	    public void BSTIterator(TreeNode root)
	    {
	        inOrder(root);
	    }

	    
	   public void inOrder(TreeNode root)
	   {
		   while(root!=null)
		   {
			   s.push(root);
			   root=root.left;
		   }
	   }
	    
	    
	    /** @return whether we have a next smallest number */
	    public boolean hasNext()
	    {
	        return !s.empty();
	    }

	    /** @return the next smallest number */
	    public int next()
	    {
	    	TreeNode temp=s.peek();
	    	s.pop();
	    	inOrder(temp.right);
	    	return temp.val;
	    }
	 
}
