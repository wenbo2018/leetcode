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
	    * @Description: TODO(������һ�仰�����������������) 
	    * ά��һ��ջ�������������˼�룬���Ͻ���ʼ��ʱ����������ջֱ��Ϊ����Ϊnull��next()ʱ������ǰtopֵ���أ�ͬʱ�жϵ�ǰֵ���Һ����Ƿ�Ϊnull����Ϊnull��һ���Һ���Ȼ�����������ջ
	    * @param @param root    �趨�ļ� 
	    * @return void    �������� 
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
