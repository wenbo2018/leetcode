package LinkedList;

import LinkedList.ReverseLinkedListII.ListNode;

/**
 * @author Administrator
 *
 */
public class ReverseLinkedList 
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
	  
	/**
	 * @param head
	 * @return
	 * ��ͷ�����ڶ����ڵ�Ͽ�������һ��ָ��ָ��ڶ����ڵ㣬�ֱ��ƶ���ָ�룬����ָ�����һ���ڵ��ݴ棬ͬʱ�ý�ָ�����һ���ڵ�ָ��ͷ�ڵ㣬����ͷ��㼴����ָ��ָ��ڵ㸳��ͷ��㣬
	 * ͬʱ���ݴ�ڵ㸳��ָ�룻
	 */
	public ListNode reverseList(ListNode head) 
    {
        if(head==null||head.next==null)
        	return head;
        ListNode pre=head;
        ListNode cur=head.next;
        pre.next=null;
        
        ListNode temp;
        while(cur!=null)
        {
        	temp=cur.next;
        	cur.next=pre;
        	pre=cur;
        	cur=temp;
        }
        return pre;
    }
	  
}
