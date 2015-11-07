package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import Tree.BinaryTreePostorderTraversal.TreeNode;

public class BinaryTreeLevelOrderTraversal
{

	
	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
    /** 
    * @Title: levelOrder 
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * 二叉树中序遍历：主要是如何保存每层输出的元素个数？
    * 设置一个标志位记录下一层元素个数，首先判断首层是否为null，不为null分别判断其左孩子跟右孩子是否为null，不为null则入队列同时标志位加1；
    * 大循环，队列不为null时执行，for循环遍历，终止条件为该层元素个数，同时清零标志位用于距离下一层元素个数，没遍历一个元素时判断其左右孩子是否为null不为null入队列标志位+1； 
    * @param @param root
    * @param @return    设定文件 
    * @return List<List<Integer>>    返回类型 
    * @throws 
    */
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
        	list.add(temp);
        }
        return list;
    }
}
