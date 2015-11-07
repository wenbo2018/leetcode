package Tree;


public class FlattenBinaryTreetoLinkedList 
{

	 public class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	 }
	 
    /** 
    * @Title: flatten 
    * @Description: ��������
    * �������ұ���������������ǰ�ڵ��������������ҵ������������ҵ��Ǹ��ڵ㣬���ýڵ��������ִ�е�ǰ�ڵ���Һ��ӣ�ͬʱ����ǰ�ڵ���ֺ���ָ��ǰ�ڵ�����ӣ�
    * ���1������ǰ�ڵ�ֻ��һ�����ӣ���ô����ǰ�ڵ���ֺ���ָ��ǰ�ڵ�����ӣ���ǰ�ڵ�����ӵ��Һ���ָ��ǰ�ڵ���Һ���
    * ���2��������ڵ㣬��ô���뵽��һ���Һ��ӣ�
    * @param @param root    �趨�ļ� 
    * @return void    �������� 
    * @throws 
    */
    public void flatten(TreeNode root) 
    {
        
    	if(root==null)
    		return;
    	while(root!=null)
    	{
    		if(root.left!=null)
    		{
        		TreeNode cur=root.left;
    			while(cur.right!=null)
    				cur=cur.right;
    			cur.right=root.right;
    			root.right=root.left;
    			root.left=null;
    		}
    		root=root.right;
    	}
    	
    }
    
    
    /** 
    * @Title: flatten2 
    * @Description: �ݹ鷽��
    * �������Һ��ӽ��еݹ����룬���ﵱǰ�ڵ�ʱ������ǰ�ڵ��������������ҵ������������ҵ��Ǹ��ڵ㣬���ýڵ��������ִ�е�ǰ�ڵ���Һ��ӣ�ͬʱ����ǰ�ڵ���ֺ���ָ��ǰ�ڵ�����ӣ�
    * ���1������ǰ�ڵ�ֻ��һ�����ӣ���ô����ǰ�ڵ���ֺ���ָ��ǰ�ڵ�����ӣ���ǰ�ڵ�����ӵ��Һ���ָ��ǰ�ڵ���Һ���
    * ���2��������ڵ㣬��ô���뵽��һ���Һ��ӣ�
    * @param @param root    �趨�ļ� 
    * @return void  �������� 
    * @throws 
    */
    public void flatten2(TreeNode root) 
    {
        
    	preOrder(root);
    }
    
    public void preOrder(TreeNode root)
    {
    	if(root==null)
    		return;
    	if(root.left!=null)
		{
    		TreeNode cur=root.left;
			while(cur.right!=null)
				cur=cur.right;
			cur.right=root.right;
			root.right=root.left;
			root.left=null;
		}
    	preOrder(root.right);
    }    
}
