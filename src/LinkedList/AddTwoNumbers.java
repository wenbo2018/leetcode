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
	 
	
	
	/**设置一个标志位判断是否有进位，设置两个指针遍历链表，分别取出两个指针节点的值，若节点为null则其值为0；初始进位为0；判断两个节点值加进位值是否
	 * 大于9，若大9将其对10整除取余数并设置进位为1；全部遍历为后判断进位是否为1，若为1，新建一个节点设置其值为1；
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
