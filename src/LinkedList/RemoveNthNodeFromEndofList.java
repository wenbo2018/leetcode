package LinkedList;

import LinkedList.ReverseLinkedList.ListNode;

public class RemoveNthNodeFromEndofList 
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
		  
	/**首先记录一遍链表的长度，接着找到倒数第n+1个节点  然后删除
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) 
    {
		if(head==null)
	         return head;
	    int k=0;
	    
	    ListNode newHead=new ListNode(0);
	    newHead.next=head;
	    
	    
	    ListNode cur=newHead;
	        
        while(cur.next!=null)
        {
            cur=cur.next;
            k++;
        }
        
        cur=newHead;
        for(int i=1;i<=k-n;i++)
        {
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return newHead.next;
    }
	/**双指针，让两个指针相差n+1步,设置一个新的头节点，让第一个节点先走n+1步，然后第2
	 * 个节点与第一个节点开始一起走直到第一个接点走到最后时第2个节点刚好就是要删除的节点的前一个节点。
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd2(ListNode head, int n) 
    {
		if(head==null)
	         return head;
	    int k=0;
	    
	    ListNode newHead=new ListNode(0);
	    newHead.next=head;
	    
	    
	    ListNode cur1=newHead;
	    ListNode cur2=newHead;
        while(k<=n)
        {
            cur1=cur1.next;
            k++;
        } 
        
        while(cur1!=null)
        {
        	cur1=cur1.next;
        	cur2=cur2.next;
        }
        
        cur2.next=cur2.next.next;
        return newHead.next;
    }

}
