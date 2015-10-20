package LinkedList;

import org.w3c.dom.ls.LSInput;

import LinkedList.PartitionList.ListNode;

public class PalindromeLinkedList 
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

    /** 将链表分成两部分，翻转后半部分然后进行比较。
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head)
    {
    	if(head==null||head.next==null)
    		return true;
    	ListNode cur=head;
    	
    	int k=0;
    	while(cur!=null)
    	{
    		cur=cur.next;
    		k++;
    	}
    	cur=head;
    	if(k%2==0)//链表长度为偶数时
    	{
    		for(int i=0;i<k/2;i++)
    			cur=cur.next;
    	}else
    	{
    		for(int i=0;i<(k/2+1);i++)
    			cur=cur.next;
		}
    	

    	
    	ListNode pre=cur;
        ListNode cur1=cur.next;
        pre.next=null;
        
        ListNode temp;
        while(cur1!=null)
        {
        	temp=cur1.next;
        	cur1.next=pre;
        	pre=cur1;
        	cur1=temp;
        }
    	
        ListNode p1=head;
        ListNode p2=pre;
        while(p2!=null)
        {
        	if(p1.val!=p2.val)
        		return false;
        	p1=p1.next;
        	p2=p2.next;
        }
        
        return true;
        
    }
	
}
