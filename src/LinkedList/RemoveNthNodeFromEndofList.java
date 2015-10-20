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
		  
	/**���ȼ�¼һ������ĳ��ȣ������ҵ�������n+1���ڵ�  Ȼ��ɾ��
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
	/**˫ָ�룬������ָ�����n+1��,����һ���µ�ͷ�ڵ㣬�õ�һ���ڵ�����n+1����Ȼ���2
	 * ���ڵ����һ���ڵ㿪ʼһ����ֱ����һ���ӵ��ߵ����ʱ��2���ڵ�պþ���Ҫɾ���Ľڵ��ǰһ���ڵ㡣
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
