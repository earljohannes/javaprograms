/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Harry
 */
class Compz implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>) o1;
        Map.Entry<String, Integer> m2 = (Map.Entry<String, Integer>) o2;
        
        if(m1.getValue()<m2.getValue())
            return 1;
        
        else if(m1.getValue()>m2.getValue())
            return -1;
        
        else
            return m1.getKey().compareTo(m2.getKey());
    }
}

class GFG 
{
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    String[] S = new String[N];
		    
		    HashMap<String, Integer> h = new HashMap<String, Integer>();
		    
		    for(int i=0; i<N; i++)
		    {
		        S[i] = sc.next();
		        
		        if(h.containsKey(S[i]))
		        {
		            int j = h.get(S[i])+1;
		            h.replace(S[i],j);
		        }
		        
		        else
		            h.put(S[i],1);
		    }
		    
		    ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String, Integer>>(h.entrySet());
		    Collections.sort(al,new Compz());
		    
		    System.out.println(al.get(0).getKey());
		}
	}
}