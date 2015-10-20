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
	 * 将头结点与第二个节点断开，设置一个指针指向第二个节点，分别移动该指针，将该指针的下一个节点暂存，同时该将指针的下一个节点指向头节点，更新头结点即将该指针指向节点赋给头结点，
	 * 同时将暂存节点赋给指针；
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
