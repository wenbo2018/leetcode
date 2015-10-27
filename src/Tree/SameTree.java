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
	
    /**递归前序遍历二叉树，分别判断值是是否相等，节点是否有空，
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
