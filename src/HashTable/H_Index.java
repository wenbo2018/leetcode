package HashTable;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.IntData;

public class H_Index 
{
	 public int hIndex(int[] citations)
	 {
		 int hindex=0;
		 if(hindex==citations.length)
			  return hindex;
	     Arrays.sort(citations);
	     for(int i=citations.length-1;i>=0&&citations[i]>=(citations.length-i);i--)
	     {
	    	 hindex=citations.length-i;
	     }
	     return hindex;
	 }
	 
	 public int hIndex2(int[] citations)
	 {
		 int hindex=0;
		 if(hindex==citations.length)
			  return hindex;
	     int[] km=new int [citations.length+1];
	     for(int i=0;i<citations.length;i++)
	     {
	    	 if(citations[i]>citations.length)
	    		 km[citations.length]++;
	    	 km[citations[i]]++;
	     }
	     
	     for(int i=1;i<km.length;i++)
	     {
	    	 if(km[i]>hindex)
	    		hindex=km[i];
	     }
	     return hindex;
	 }
	 
}
