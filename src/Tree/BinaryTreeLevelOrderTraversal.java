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
    * @Description: TODO(������һ�仰�����������������)
    * �����������������Ҫ����α���ÿ�������Ԫ�ظ�����
    * ����һ����־λ��¼��һ��Ԫ�ظ����������ж��ײ��Ƿ�Ϊnull����Ϊnull�ֱ��ж������Ӹ��Һ����Ƿ�Ϊnull����Ϊnull�������ͬʱ��־λ��1��
    * ��ѭ�������в�Ϊnullʱִ�У�forѭ����������ֹ����Ϊ�ò�Ԫ�ظ�����ͬʱ�����־λ���ھ�����һ��Ԫ�ظ�����û����һ��Ԫ��ʱ�ж������Һ����Ƿ�Ϊnull��Ϊnull����б�־λ+1�� 
    * @param @param root
    * @param @return    �趨�ļ� 
    * @return List<List<Integer>>    �������� 
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
