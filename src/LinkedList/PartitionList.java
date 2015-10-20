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
	
	/** �½�����ͷ�ڵ㣬�������α꣬�������ڴ���x��С��x�ڵ㣬ͬʱ����һ���α����ƶ�ס����������һ������ֱ��ҳ��ڵ����������ƴ��������
	 * @param head
	 * @param x
	 * @return
	 */
	public ListNode partition(ListNode head, int x) 
    {
        if(head==null)
        	return head;
        ListNode head1=new ListNode(0);
        ListNode cur1=head1;//С��xͷ���
        
        
        ListNode head2=new ListNode(0);//����xͷ���
        ListNode cur2=head2;
        
        
        ListNode cur=head;//ס�α�
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
