package LinkedList;

import LinkedList.PartitionList.ListNode;

public class RemoveDuplicatesfromSortedListII
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
	
	public ListNode deleteDuplicates(ListNode head) 
    {
		    if(head==null||head.next==null)
	           return head;

	        ListNode newHead=new ListNode(0);
	        newHead.next=head;
	        
	        ListNode pre=newHead;
	        ListNode cur=newHead.next;
	        while(cur!=null&&cur.next!=null)
	        {
	        	if(cur.val==cur.next.val)
	        	{
	        		while(cur.next!=null&&cur.val==cur.next.val)
	        		{
	        			cur=cur.next;
	        		}
	        		pre.next=cur.next;
	        		cur=cur.next;
	        	}else
	        	{
	        		pre=cur;
	        		cur=cur.next;
	        	}
	        }
	        return newHead.next;
    }
	
}
