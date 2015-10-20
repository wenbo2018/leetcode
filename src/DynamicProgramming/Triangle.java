package DynamicProgramming;

import java.util.List;

public class Triangle 
{
	/**˼·������һdp���鱣��ӵײ㵽��i���е���С·���ͣ���ʼ��dp����Ϊ��Ͳ�ֵ������ʽΪ��dp[j] =triangle.get(i).get(j) + Math.min( dp[j], dp[j+1]);��������
	 * ��i����С·���͵��ڵ�i+1����С··���ͼӵ�i��ĳ��ԭʼ��
	 * @param triangle
	 * @return
	 */
	public int minimumTotal(List<List<Integer>> triangle) 
    {
       int len=triangle.size();
       int [] dp=new int[len];//dp[i]��ʾ����ÿ���i��Ԫ�ص�·���ͣ�dp[i]=(��ǰ���i��Ԫ��)+(��һ���i��Ԫ�غ���һ���i+1��Ԫ�ؽ�С�Ǹ�)
       
       for(int i=0; i<len; i++)   
           dp[i] = triangle.get(len-1).get(i);  
       //�ӵ����ڶ��㿪ʼ���ϱ���
       for(int i=len-2; i>=0; i--) 
       {  
    	    //����ÿһ��ÿһ��Ԫ�أ���������һ�ε����Ԫ��ʱ����С·��
           for(int j=0; j<triangle.get(i).size(); j++) 
           {  
               dp[j] =triangle.get(i).get(j) + Math.min( dp[j], dp[j+1] );                      
           }  
       }  
       return dp[0];
    }
}
