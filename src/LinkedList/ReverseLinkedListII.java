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
	 
	  
	  
	/**˼·:�½�һ��ͷ�ڵ㣬�����m���ڵ�֮ǰ�Ǹ��ڵ㼰��m���ڵ㣬����m����n���ڵ�֮��Ľڵ㷭ת��Ȼ������������������
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
	        
	        ListNode firstHead=newHead;//�½�һ��ͷ�ڵ�
	        
	        for(int i=0;i<m-1;i++)
	            firstHead=firstHead.next;//�ƶ���һ��ͷ�ڵ㵽��m���ڵ��ǰһ���ڵ㡣
	        
	        ListNode secondHead=firstHead.next;//�����m���ڵ㼰��ת���n���ڵ�
	        
	        ListNode tempHead=null;//��ʱͷ���
	        ListNode tempNext=null;//��ʱ��һ���ڵ�
	        ListNode cur=firstHead.next;//�α��¼
	        
	        for(int i=0;i<n-m+1;i++)
	        {
	            tempHead=cur;//����ǰ�ڵ㸳����ʱͷ�ڵ�
	            cur=cur.next;//�α����
	            tempHead.next=tempNext;//��ʱͷ�ڵ�ָ����һ���ڵ�
	            tempNext=tempHead;//�ɵ���ʱͷ������Ϊ��ͷ�ڵ����һ���ڵ�
	        }
	        firstHead.next=tempHead;
	        secondHead.next=cur;
	        
	        return newHead.next;
    }
}
