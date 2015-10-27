package LinkedList;

import LinkedList.PalindromeLinkedList.ListNode;

public class AddTwoNumbers 
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
	 
	
	
	/**����һ����־λ�ж��Ƿ��н�λ����������ָ����������ֱ�ȡ������ָ��ڵ��ֵ�����ڵ�Ϊnull����ֵΪ0����ʼ��λΪ0���ж������ڵ�ֵ�ӽ�λֵ�Ƿ�
	 * ����9������9�����10����ȡ���������ý�λΪ1��ȫ������Ϊ���жϽ�λ�Ƿ�Ϊ1����Ϊ1���½�һ���ڵ�������ֵΪ1��
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode head=new ListNode(0);
        ListNode cur=head;
        ListNode p1=l1,p2=l2;
        int top=0;
        while(p1!=null||p2!=null)
        {
            
            int temp1=0;
            if(p1!=null)
            {
                temp1=p1.val;
                p1=p1.next;
            }
            
            int temp2=0;
            if(p2!=null)
            {
                temp2=p2.val;
                p2=p2.next;
            }
            
            int temp=temp1+temp2+top;
            top=0;
            if(temp>9)
              {
                  ListNode node=new ListNode(temp%10);
                  cur.next=node;
                  cur=node;
                  top=1;
              }else
              {
                  ListNode node=new ListNode(temp%10);
                  cur.next=node;
                  cur=node;
              }
        }
         
        
            if(top==1)
            {
                 ListNode m=new ListNode(1);
                 cur.next=m;
                 return head.next;
            }else
            {
                return head.next;
            }
    }
	
	
	
}
