package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;



public class BinaryTreePaths
{

	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	 List<String> res = new ArrayList<String>();
	    
	    public List<String> binaryTreePaths(TreeNode root)
	    {
	        if(root != null) 
	       findPaths(root,String.valueOf(root.val));
	        return res;
	    }
	    
	    private void findPaths(TreeNode n, String path)
	    {
	        if(n.left == null && n.right == null)
	        	res.add(path);
	        if(n.left != null) 
	        	findPaths(n.left, path+"->"+n.left.val);
	        if(n.right != null) 
	        	findPaths(n.right, path+"->"+n.right.val);
	    }

     
}
