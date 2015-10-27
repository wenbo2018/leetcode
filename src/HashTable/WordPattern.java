package HashTable;

import java.util.HashMap;
import java.util.Map;

public class WordPattern 
{

   /**ά��һ��Hash�� ����patten��ֵ��str������pattem��ÿһ��ֵ��
    * ��patternֵ�ڼ��д��ڣ�ͨ���ü���ȡ��ֵ��str�Ƚ� ������ȷ���false��
    * �������ڣ����жϸ�strֵ�Ƿ���ڣ��������򷵻�false�����򽫼�ֵ��put��map��
    * ��󷵻�true��
 * @param pattern
 * @param str
 * @return
 */
public boolean wordPattern(String pattern, String str) 
   {
	   Map<String, String> map=new HashMap<String,String>();
	   
	   String[] km=str.split(" ");
	   if(pattern.length()!=km.length)
		   return false;
	   for(int i=0;i<km.length;i++)
	   {
		   if(map.containsKey(String.valueOf(pattern.charAt(i))))
		   {
			   if(!map.get(String.valueOf(pattern.charAt(i))).equals(km[i]))
			           return false;
		   }else
		   {
			   if(map.containsValue(km[i]))
				   return false;
			   map.put(String.valueOf(pattern.charAt(i)), km[i]);
		   }
	   }
        return true;
   }
 
  @org.junit.Test
  public void Test()
  {
	  String pattern="abba",str="dog cat cat dog";
	  System.out.println(wordPattern(pattern, str));
  }

}
