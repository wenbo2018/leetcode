package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sun.beans.util.Cache.Kind;
import com.sun.org.apache.regexp.internal.recompile;

public class GroupAnagrams
{
	public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, List<String>> map=new HashMap<String,List<String>>();
        
        for(int i=0;i<strs.length;i++)
        {
        	char[] temp=strs[i].toCharArray();
        	Arrays.sort(temp);
        	if(map.containsKey(String.valueOf(temp)))
        	{
        		map.get(String.valueOf(temp)).add(strs[i]);
        	}else
        	{
        		List<String> list=new ArrayList<String>();
        		list.add(strs[i]);
        		map.put(String.valueOf(temp), list);
        	}
        }
        List<List<String>> lists=new ArrayList<List<String>>();
        for(Map.Entry<String, List<String>> entry:map.entrySet())
        {    
            Collections.sort(entry.getValue()); 
            lists.add(entry.getValue());
        }   
        return lists;
    }

	
	
	 @org.junit.Test
	  public void Test()
	  {
		  
		  String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		  
		  System.out.println(groupAnagrams(strs).toString());
	  }
	
}
