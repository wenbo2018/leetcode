package Tree;

import java.util.LinkedList;
import java.util.Queue;

import Tree.SymmetricTree.TreeNode;
import sun.reflect.generics.tree.Tree;

public class InvertBinaryTree 
{

	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	 
	 public TreeNode invertTree(TreeNode root) 
	 {
	        if(root==null)
	        	return null;
	        TreeNode l=root.left;
	        root.left=invertTree(root.right);
	        root.right=invertTree(l);
	        return root;
	 }
	 
	 public TreeNode invertTree2(TreeNode root) 
	 {
	        if(root==null)
	        	return null;
	       Queue<TreeNode> queue =new LinkedList<TreeNode>();
	       queue.offer(root);
	       while(queue.size()!=0)
	       {
	    	   TreeNode temp=queue.poll();
	    	   TreeNode pNode=temp.right;
	    	   temp.right=temp.left;
	    	   temp.left=pNode;
	    	   if(temp.left!=null)
	    		   queue.offer(temp.left);
	    	   if(temp.right!=null)
	    		   queue.offer(temp.right);
	       }
	       return root;
	 }
	 
}
