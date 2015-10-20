package LinkedList;

import LinkedList.ReverseLinkedList.ListNode;

public class PartitionList 
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
	
	/** 新建两个头节点，和两个游标，用来挂在大于x跟小于x节点，同时设置一个游标来移动住链表。最后遍历一遍链表分表找出节点最后将两部分拼接起来。
	 * @param head
	 * @param x
	 * @return
	 */
	public ListNode partition(ListNode head, int x) 
    {
        if(head==null)
        	return head;
        ListNode head1=new ListNode(0);
        ListNode cur1=head1;//小于x头结点
        
        
        ListNode head2=new ListNode(0);//大于x头结点
        ListNode cur2=head2;
        
        
        ListNode cur=head;//住游标
        ListNode temp=null;
        while(cur!=null)
        {
        	temp=cur;
        	cur=cur.next;
        	if(temp.val<x)
        	{
        		cur1.next=temp;
        		cur1=temp;
        		temp.next=null;
        	}else
        	{
        		cur2.next=temp;
        		cur2=temp;
        		temp.next=null;
        	}
        }
        cur1.next=head2.next;
        return head1.next;
    }
	
}
