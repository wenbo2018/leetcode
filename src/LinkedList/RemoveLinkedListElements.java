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
	        {   //�����ǰֵ����val���ƶ�ָ�뵽��һ��ֵ����һ��ֵΪnull��˵�������һ��������Ҫ����һ��ָ��ָ��null��
	            if(cur.val==val)
	            {
	                cur=cur.next;
	                if(cur==null)
	                {
	                  pre.next=cur;
	                }
	            }else
	            {   //����ǰֵ������avl,��ǰָ��ָ��ǰֵ��ͬʱ����ǰֵ��ֵ������ǰָ��ͬʱ���µ�ǰָ�롣
	                pre.next=cur;
	                pre=cur;
	                cur=cur.next;
	            }
	        }
	        return newHead.next;
    }
	
}
