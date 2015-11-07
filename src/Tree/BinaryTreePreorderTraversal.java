package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Tree.ConvertSortedListtoBinarySearchTree.TreeNode;

public class BinaryTreePreorderTraversal
{
	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	 List<Integer> list=new ArrayList<Integer>();
	 public List<Integer> preorderTraversal(TreeNode root) {
	        preOrder(root);
	        return list;
	 }

	 public void preOrder(TreeNode root)
	 {
		 if(root==null)
			 return;
		 list.add(root.val);
		 preOrder(root.left);
		 preOrder(root.right);
	 }
	 
	 
	 public List<Integer> integerspreorderTraversal(TreeNode root)
	 {
		 List<Integer> hList=new ArrayList<Integer>();
		 if(root==null)
			 return hList;
		 TreeNode cur=root;
		 Stack<TreeNode> stack=new Stack<TreeNode>();
      
		 while(cur!=null||!stack.empty())
		 {
			 while(cur!=null)
			 {
				 hList.add(cur.val);
				 cur=cur.left;
			 }
			 
			 cur=stack.peek();
			 stack.pop();
			 cur=cur.right;
		 }
		 return hList;
	 }
}
