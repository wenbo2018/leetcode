package Tree;

import java.util.ArrayList;
import java.util.List;

import LinkedList.PalindromeLinkedList.ListNode;
import Tree.ConvertSortedArraytoBinarySearchTree.TreeNode;

/** 
* @ClassName: ConvertSortedListtoBinarySearchTree 
* @Description: TODO(������һ�仰��������������) 
* @author ���Ĳ�
* @date 2015��10��31�� ����7:58:18 
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
    * @Description: TODO(������һ�仰�����������������)
    * ����һ����������һ��ArrayList�����棬Ȼ�󷽷�ͬConvert Sorted Array to Binary Search Tree��
    * @param @param head
    * @param @return    �趨�ļ� 
    * @return TreeNode    �������� 
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
    * @Description: TODO(������һ�仰�����������������) 
    * ���ҵ�rootȻ������������ֱ�ݹ���á������ֿ���һ���Ե����ϵķ������㷨���Ӷ�ΪO(N)��
    * �ȵݹ鹹�����������ڹ�����������ͬʱ�����ƶ������ͷָ�룬�����ͷָ����Զ�Ƕ�Ӧ��ǰ����λ�õġ�
    * һֱ����Ҷ�ӽڵ㣬��Ҷ�ӽڵ��Ӧ�ľ�������ĵ�һ��Ԫ�أ�������Ҷ�ӽڵ�֮���ƶ�����ǰָ�롣
    * @param @param head
    * @param @return    �趨�ļ� 
    * @return TreeNode    �������� 
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
