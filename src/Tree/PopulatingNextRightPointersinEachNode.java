package Tree;

public class PopulatingNextRightPointersinEachNode 
{



	  public class TreeLinkNode
	  {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	  }
	 
    /**从最左边这个节点开始，每层设置一个指针p移动，若下一层有节点则将p.left.next指向p.right,如果p的右边还有节点
     * 则将p.right.next指向p.next.left节点，同时移动p到下一个节点，该层遍历完后,移动指针到下一层最左边这个节点
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
