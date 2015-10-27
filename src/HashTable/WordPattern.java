package HashTable;

import java.util.HashMap;
import java.util.Map;

public class WordPattern 
{

   /**维护一个Hash表 键存patten，值存str，遍历pattem的每一个值，
    * 若pattern值在键中存在，通过该键获取到值与str比较 若不相等返回false；
    * 若不存在，则判断该str值是否存在，若存在则返回false，否则将键值对put到map中
    * 最后返回true；
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
