package Tree;

import java.util.Stack;

import Tree.InvertBinaryTree.TreeNode;

public class SumRoottoLeafNumbers 
{

	public int sumNumbers(TreeNode root)
    {
        if(root==null)
        	return 0;
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        int sum=0;
        while(stack.size()!=0)
        {
        	TreeNode temp=stack.peek();
        	sum=sum+stack.peek().val*(stack.size()-1);
        	stack.pop();
        	
        	if(temp.right!=null)
        		stack.push(temp.right);
        	if(temp.left!=null)
        		stack.push(temp.left);
        }
        return sum;
    }
}
