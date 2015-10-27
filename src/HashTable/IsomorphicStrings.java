package HashTable;

import java.util.HashMap;
import java.util.Map;

import sun.nio.cs.FastCharsetProvider;

public class IsomorphicStrings 
{

	/**ά������Hash��,������ĸ,ֵ��i(iΪ��i����ĸ),�����ַ���������������ֵ������飬�ֱ�Ƚ���������ֵ�Ƿ����
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean isIsomorphic(String s, String t) 
    {
	    Map<String,Integer> maps=new HashMap<String,Integer>();
        Map<String,Integer> mapt=new HashMap<String,Integer>();
        int[] as=new int[s.length()];
        int[] at=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
        	if(maps.containsKey(String.valueOf(s.charAt(i))))
        	{
        		as[i]=maps.get(String.valueOf(s.charAt(i)));
        	}else
        	{
        		maps.put(String.valueOf(s.charAt(i)),i);
        		as[i]=i;
        	}

        	if(mapt.containsKey(String.valueOf(t.charAt(i))))
        	{
        		at[i]=mapt.get(String.valueOf(t.charAt(i)));
        	}else
        	{
        		mapt.put(String.valueOf(t.charAt(i)),i);
        		at[i]=i;
        	}
        }
        for(int i=0;i<as.length;i++)
        {
        	if(as[i]!=at[i])
        		return false;
        }
        return true;
    }
	
	  @org.junit.Test
	  public void Test()
	  {
		  String s="eag",t="add";
		  System.out.println(isIsomorphic(s, t));
	  }
	
}
