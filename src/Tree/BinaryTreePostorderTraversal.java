package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.BinaryTreeInorderTraversal.TreeNode;

public class BinaryTreePostorderTraversal 
{

	
	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	 
	 List<Integer> list=new ArrayList<Integer>();
	 
	
    public List<Integer> postorderTraversal(TreeNode root)
    {
        postOrder(root);
        return list;
    }
    
    public void postOrder(TreeNode root)
    {
    	if(root==null)
    		return;
    	postOrder(root.left);
    	postOrder(root.right);
    	list.add(root.val);
    }
    
    
    public List<Integer> postorderTraversal2(TreeNode root)
    {
    	List<Integer> list=new ArrayList<Integer>();
    	if(root==null)
        return list;
    
    	
    	TreeNode cur=root;
    	TreeNode pre=null;
    	Stack<TreeNode> stack=new Stack<TreeNode>();
    	while(!stack.empty()||cur!=null)
    	{
    		while(cur!=null)
    		{
    			stack.push(cur);
    			cur=cur.left;
    		}
    		cur=stack.peek();
    		if(cur.right==null||cur.right==pre)
    		{
    			list.add(cur.val);
    			pre=cur;
    			stack.pop();
    			cur=null;
    		}else
    		{
    			cur=cur.right;
    		}
    	}
    	
        return list;
    }
    
}
