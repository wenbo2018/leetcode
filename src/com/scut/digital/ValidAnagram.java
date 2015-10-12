package com.scut.digital;

import java.util.Arrays;

public class ValidAnagram
{

	public  boolean isAnagram(String s, String t)
    {
      
       if(s.length()!=t.length())
          return false;
       char [] a=s.toCharArray();
       char [] b=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
        return String.valueOf(a).equals(String.valueOf(b));
        
    }
	
	
	public  boolean isAnagramAsi(String s, String t)
    {
      
       if(s.length()!=t.length())
          return false;
       char [] a=s.toCharArray();
       char [] b=t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
        return String.valueOf(a).equals(String.valueOf(b));
        
    }
	
	@org.junit.Test
	public void Test()
	{
		char a='a';
		System.out.println((int)a);
	}
	
}
