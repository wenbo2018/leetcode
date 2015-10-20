package LinkedList;

import LinkedList.ReverseLinkedList.ListNode;

public class ReverseLinkedListII
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
	 
	  
	  
	/**思路:新建一个头节点，保存第m个节点之前那个节点及第m个节点，将第m到第n个节点之间的节点翻转，然后将三段相连接起来。
	 * @param head
	 * @param m
	 * @param n
	 * @return
	 */
	public ListNode reverseBetween(ListNode head, int m, int n)
    {
		    if(m==n)
	          return head;
	        ListNode newHead=new ListNode(0);
	        newHead.next=head;
	        
	        ListNode firstHead=newHead;//新建一个头节点
	        
	        for(int i=0;i<m-1;i++)
	            firstHead=firstHead.next;//移动第一个头节点到第m个节点的前一个节点。
	        
	        ListNode secondHead=firstHead.next;//保存第m个节点及翻转后第n个节点
	        
	        ListNode tempHead=null;//临时头结点
	        ListNode tempNext=null;//临时下一个节点
	        ListNode cur=firstHead.next;//游标记录
	        
	        for(int i=0;i<n-m+1;i++)
	        {
	            tempHead=cur;//将当前节点赋给临时头节点
	            cur=cur.next;//游标更新
	            tempHead.next=tempNext;//临时头节点指向下一个节点
	            tempNext=tempHead;//旧的临时头结点更新为新头节点的下一个节点
	        }
	        firstHead.next=tempHead;
	        secondHead.next=cur;
	        
	        return newHead.next;
    }
}
