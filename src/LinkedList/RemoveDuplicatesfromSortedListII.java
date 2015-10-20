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
	        ListNode cur=newHead.next.next;
	        ListNode temp=newHead.next;
	        boolean flag=false;
	        while(cur!=null)
	        {
	        	while(temp.val==cur.val)
	        	{
	        		flag=true;
	        		cur=cur.next;
	        		if(cur==null)
	        			break;
	        	}
	        	if(flag)
	        	{
	        		pre.next=cur;
	        		temp=cur;
	        		cur=cur.next;
	        	}else
	        	{
	        		pre=temp;
	        		temp=cur;
	        		cur=cur.next;
	        	}
	        }
	        return newHead.next;
    }
	
}
