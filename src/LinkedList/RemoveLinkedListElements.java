package LinkedList;

import LinkedList.RemoveDuplicatesfromSortedListII.ListNode;

public class RemoveLinkedListElements 
{
	public class ListNode 
	  {
	      int val;
	      ListNode next;
	      ListNode(int x)
	      { 
	    	  val = x; 
	      }
	  }
	
	public ListNode removeElements(ListNode head, int val)
    {
		if(head==null)
	           return null;
	        if(head.next==null&&head.val==val)
	           return null;
	        ListNode newHead=new ListNode(0);
	        newHead.next=head;
	        ListNode pre=newHead;
	        ListNode cur=newHead.next;
	        while(cur!=null)
	        {   //如果当前值等与val，移动指针到下一个值，若一个值为null则说明是最后一个，则需要将上一个指针指向null；
	            if(cur.val==val)
	            {
	                cur=cur.next;
	                if(cur==null)
	                {
	                  pre.next=cur;
	                }
	            }else
	            {   //若当前值不等于avl,将前指针指向当前值，同时将当前值赋值给更新前指针同时更新当前指针。
	                pre.next=cur;
	                pre=cur;
	                cur=cur.next;
	            }
	        }
	        return newHead.next;
    }
	
}
