/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class C implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        Map.Entry<Integer, Integer> m1 = (Map.Entry<Integer, Integer>) o1;
        Map.Entry<Integer, Integer> m2 = (Map.Entry<Integer, Integer>) o2;
        
        if(m1.getValue() < m2.getValue())
            return 1;
        
        else if(m1.getValue() > m2.getValue())
            return -1;
        
        else
            return m1.getKey().compareTo(m2.getKey());
    }
}

class TopKStream 
{
    public static List SortByValues(HashMap<Integer,Integer> h)
    {
        List<Map.Entry<Integer, Integer>> l = new LinkedList<Map.Entry<Integer, Integer>>(h.entrySet());
        Collections.sort(l, new C());
        return l;
    }
    
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

            for(int i=0; i<N; i++)
            {
                int a = sc.nextInt();

                if(h.containsKey(a))
                {
                    int v = h.get(a);
                    v++;
                    h.replace(a,v);
                }

                else
                {
                    h.put(a,1);
                }

                List<Map.Entry<Integer, Integer>> l = SortByValues(h);
                
                for(int j=0; j<K && j<l.size(); j++)
                {
                    System.out.print(l.get(j).getKey()+" ");
                }

            }
            
            System.out.println("");
        }
    }
}