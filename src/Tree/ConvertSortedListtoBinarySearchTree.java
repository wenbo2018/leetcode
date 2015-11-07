package Tree;

import java.util.ArrayList;
import java.util.List;

import LinkedList.PalindromeLinkedList.ListNode;
import Tree.ConvertSortedArraytoBinarySearchTree.TreeNode;

/** 
* @ClassName: ConvertSortedListtoBinarySearchTree 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author 申文波
* @date 2015年10月31日 下午7:58:18 
*  
*/
public class ConvertSortedListtoBinarySearchTree
{
	
	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }

	 public class ListNode 
	  {
	      int val;
	      ListNode next;
	      ListNode(int x)
	      { 
	    	  val = x; 
	      }
	  }
	 
	 
	 
	 
    /** 
    * @Title: sortedListToBST 
    * @Description: TODO(这里用一句话描述这个方法的作用)
    * 方法一：将链表用一个ArrayList来保存，然后方法同Convert Sorted Array to Binary Search Tree；
    * @param @param head
    * @param @return    设定文件 
    * @return TreeNode    返回类型 
    * @throws 
    */
    public TreeNode sortedListToBST(ListNode head)
    {
        if(head==null)
        	return null;
        ListNode p=head;
        int len=0;
        List<Integer> list=new ArrayList<Integer>();
        while(p!=null)
        {
        	len++;
        	list.add(p.val);
        	p=p.next;
        }
      return   buileTree1(list, 0, len);
        
    }
    public TreeNode buileTree1(List<Integer> list,int left,int right)
	{
		if(left>right)
			return null;
		int mid=(left+right)/2;
		TreeNode root=new TreeNode(list.get(mid));
		root.left=buileTree1(list, left, mid-1);
		root.right=buileTree1(list, mid+1, right);
		return root;
	}
    
    

      
    /** 
    * @Title: sortedListToBST2 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * 先找到root然后对左右子树分别递归调用。网上又看到一种自底向上的方法，算法复杂度为O(N)。
    * 先递归构建左子树，在构建左子树的同时不断移动链表的头指针，链表的头指针永远是对应当前子树位置的。
    * 一直到左叶子节点，左叶子节点对应的就是链表的第一个元素，生成左叶子节点之后移动链表当前指针。
    * @param @param head
    * @param @return    设定文件 
    * @return TreeNode    返回类型 
    * @throws 
    */
    public TreeNode sortedListToBST2(ListNode head)
    {  
        if(head==null)
        {  
            return null;  
        }  
        currentHead = head;  
        int len = 0;  
        while(head!=null)
        {  
            len++;  
            head = head.next;  
        }  
          
        return buildTree(0, len-1);  
    }  
    static ListNode currentHead = null;  
    TreeNode buildTree(int start, int end)
    {  
        if(start>end)
        {  
            return null;  
        }  
        int mid = start+(end-start)/2;  
        TreeNode left=buildTree(start, mid-1);  
        TreeNode root = new TreeNode(currentHead.val);  
        root.left = left;  
        currentHead = currentHead.next;  
        root.right = buildTree(mid+1, end);  
        return root;  
    }  
}
