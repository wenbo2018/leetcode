package Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import Tree.InvertBinaryTree.TreeNode;

public class BinaryTreeInorderTraversal
{
    
	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	 
	 List<Integer> list=new ArrayList<Integer>();
	 
	 /** 
	* @Title: inorderTraversal 
	* @Description: TODO(������һ�仰�����������������) 
	* �ݹ鷽���ܼ�
	* @param @param root
	* @param @return    �趨�ļ� 
	* @return List<Integer>    �������� 
	* @throws 
	*/
	public List<Integer> inorderTraversal(TreeNode root)
	 {
	        inOrder(root);
	        return list;
	 }
	 
	 public void inOrder(TreeNode root)
	 {
		 if(root==null)
			 return;
		 inOrder(root.left);
		 list.add(root.val);
		 inorderTraversal(root.right);
	 }
	 
	 
	 /** 
	* @Title: iterInOrder 
	* @Description: TODO(������һ�仰�����������������) 
	* �������������
	* @param @return    �趨�ļ� 
	* @return List<Integer>    �������� 
	* @throws 
	*/
	 public List<Integer> iterInOrder(TreeNode root)
	 {
		 List<Integer> list=new ArrayList<Integer>();
	     if(root==null)
			 return list;
		 Stack<TreeNode> stack=new Stack<TreeNode>();
		 TreeNode cur=root;

		 while(!stack.empty()||cur!=null)
		 {
			 while(cur!=null)
			 {
				 stack.push(cur);
				 cur=cur.left;
			 }
			 
			 cur=stack.peek();
			 list.add(cur.val);
			 stack.pop();
			 cur=cur.right;
		 }
		 return list;
	 }
}
