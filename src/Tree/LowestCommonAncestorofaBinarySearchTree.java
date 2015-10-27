package Tree;

import Tree.PathSum.TreeNode;

public class LowestCommonAncestorofaBinarySearchTree 
{


	public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
     {
    	 if(root==null || p==null || q==null) return null;  
    	 if(Math.max(p.val, q.val) < root.val)   
             return lowestCommonAncestor(root.left, p, q);  
          else if(Math.min(p.val, q.val) > root.val)  
             return lowestCommonAncestor(root.right, p, q);  
             else return root;  
     }
     
     public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) 
     {
    	 if(root==null || p==null || q==null) return null;  
    	 TreeNode cur=root;
    	 while(cur!=null)
    	 {
    		 if(Math.max(p.val, q.val)<cur.val)
    			 cur=cur.left;
    		 if(Math.min(p.val, q.val)>cur.val)
    			 cur=cur.right;
    		 return cur;
    	 }
    	 return cur;
     }
     
}
