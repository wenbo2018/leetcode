package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.BinaryTreeLevelOrderTraversal.TreeNode;

public class BinaryTreeLevelOrderTraversalII 
{

	public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
   public List<List<Integer>> levelOrder(TreeNode root)
   {
       List<List<Integer>> list=new ArrayList<List<Integer>>();
       Queue<TreeNode> queue=new LinkedList<TreeNode>();
   	int width=0;
       if(root!=null)
       {
       	List<Integer> a=new ArrayList<Integer>();
       	a.add(root.val);
       	list.add(a);
       	if(root.left!=null)
       	{
       		queue.add(root.left);
       		width++;
       	}
       	if(root.right!=null)
       	{
       		queue.add(root.right);
       		width++;
       	}
       }
       
       while(!queue.isEmpty())
       {
       	List<Integer> temp=new ArrayList<Integer>();
           int flag=width;
           width=0;
       	for(int i=0;i<flag;i++)
       	{
       		TreeNode treeNode=queue.peek();
       		temp.add(treeNode.val);
       		queue.remove();
       		if(treeNode.left!=null)
       		{
       			queue.add(treeNode.left);
       			width++;
       		}
       		if(treeNode.right!=null)
       		{
       			queue.add(treeNode.right);
       			width++;
       		}
       	}
       	list.add(0,temp);
       }
       return list;
   }
}
