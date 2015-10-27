package Tree;

import java.util.Stack;

import org.junit.Test;

import com.scut.digital.ValidAnagram;
import com.sun.org.apache.regexp.internal.recompile;

import Tree.MinimumDepthofBinaryTree.TreeNode;

public class PathSum 
{

	public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	
    /**���ϵݹ�����������ÿ�ε���һ����sum��ȥ��һ���ڵ�ֵ������Ҷ�ӽڵ�ʱ�жϵ�ǰ�ڵ�ֵ�Ƿ���sum��� ��
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum)
    {
    	
        if(root==null)
        	return false;
        else
        	if(root.left==null&&root.right==null&&root.val==sum)
        		return true;
        	else
        		return hasPathSum(root.left, sum-root.val)||hasPathSum(root.right, sum-root.val);
    }
    
    @Test
    public  void Test()
    {
    	TreeNode root=new TreeNode(1);
    	root.left=new TreeNode(2);
    	System.out.println(hasPathSum(root, 0));
    }
    
}
