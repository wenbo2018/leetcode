package Tree;

public class PopulatingNextRightPointersinEachNode 
{



	  public class TreeLinkNode
	  {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	  }
	 
    /**�����������ڵ㿪ʼ��ÿ������һ��ָ��p�ƶ�������һ���нڵ���p.left.nextָ��p.right,���p���ұ߻��нڵ�
     * ��p.right.nextָ��p.next.left�ڵ㣬ͬʱ�ƶ�p����һ���ڵ㣬�ò�������,�ƶ�ָ�뵽��һ�����������ڵ�
     * @param root
     */
    public void connect(TreeLinkNode root)
    {
        if(root==null)
        	return ;
        TreeLinkNode cur=root;
        while(cur.left!=null)
        {
           TreeLinkNode p=cur;
        	while(p!=null)
        	{
                p.left.next=p.right;
        		if(p.next!=null)
        			p.right.next=p.next.left;
        		p=p.next;
        	}
        	cur=cur.left;
        }
    }
}
