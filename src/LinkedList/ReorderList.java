package LinkedList;

public class ReorderList 
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
	
	public void reorderList(ListNode head) 
    {
       if(head == null||head.next==null||head.next.next==null)
       {  
            return;  
        }  
        ListNode fast=head,slow=head;//设置两个快慢节点找到中间节点
        
         while(fast!=null)
         {
             fast=fast.next;
             if(fast==null)
              break;
             fast=fast.next;
             slow=slow.next;
         }
         
        ListNode pre=slow.next;
        slow.next=null;
        ListNode cur=pre.next;
        pre.next=null;
        
        while(cur!=null)
        {
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
         
        ListNode head3=head,head4=pre;
        while(head4!=null)
        {
            ListNode temp1=head4.next;
            ListNode temp2=head3.next;
            
            head3.next=head4;
            head4.next=temp2;
            head3=temp2;
            head4=temp1;
        }
    }
}
