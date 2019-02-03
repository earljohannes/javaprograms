/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/*package whatever //do not write package name here */

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Compz implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        String s1 = (String) o1;
        String s2 = (String) o2;
        
        return s1.compareTo(s2);
    }
}

public class TinyMiny 
{
    public static ArrayList<String> al;
    
    public static String swap(String s, int i, int j)
    {
        char[] c = s.toCharArray();
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
        return new String(c);
    }
    
    public static void smP(String s, int i)
    {
        if(i==s.length()-1)
        {
            al.add(s);
            return;
        }
        
        for(int k=i; k<s.length(); k++)
        {
            s = swap(s,i,k);
            smP(s,i+1);
            s = swap(s,i,k);
        }
    }
    
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            int A = sc.nextInt();
            al = new ArrayList<String>();
            StringBuffer sb = new StringBuffer("");
            StringBuffer ans = new StringBuffer("");

            for(int i=1; i<=A; i++)
            {
                sb.append( (int)  Math.pow(N,i) );
            }

            for(int i=0; i<sb.length(); i++)
            {
                al.add(sb.charAt(i)+"");
            }
            
            /*
            String[] list = str.split("");
            Arrays.sort(list);
            */
            
            Collections.sort(al, new Compz());

            for(String i : al)
            ans.append(i);

        BigInteger b = new BigInteger(ans.toString());

        System.out.println(b);
        }
    }
}