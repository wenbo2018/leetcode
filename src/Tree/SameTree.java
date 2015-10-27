package Tree;

import Tree.SymmetricTree.TreeNode;

public class SameTree 
{
    
	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	
    /**�ݹ�ǰ��������������ֱ��ж�ֵ���Ƿ���ȣ��ڵ��Ƿ��пգ�
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
         if(p==null&&q==null)
        	 return true;
         else if(p==null||q==null)
        	 return false;
         if(p.val!=q.val)
        	 return false;
         else 
        	 return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }
}
