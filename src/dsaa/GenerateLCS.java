/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaa;

/**
 *
 * @author Harry
 */
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Comp implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        String s1 = (String) o1;
        String s2 = (String) o2;
        
        return s1.compareTo(s2);
    }
}

public class GenerateLCS 
{
    public static LinkedHashSet<String> h;
    public static int max;
    public static int ip;
    
    public static void P(int[][] dp, String s1, String s2,int i, int j, StringBuffer sb)
    {
        //System.out.println(i+"  "+j);
        ip++;
        if(sb.length()==max)
        {
            String s = new String(sb);
            h.add(s);
            return;
        }
        
        if(i<=0 || j<=0)
            return;
        
        
        if(s1.charAt(i-1)==s2.charAt(j-1))
        {
            sb.insert(0,s1.charAt(i-1));
            P(dp,s1,s2,i-1,j-1,sb);
            sb.deleteCharAt(0);
        }
        
        else
        {
            if(dp[i][j-1]==dp[i][j])
                P(dp,s1,s2,i,j-1,sb);
            
            if(dp[i-1][j]==dp[i][j])
                P(dp,s1,s2,i-1,j,sb);
        }
        
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-->0)
	    {
	        String s1 = sc.next();
	        String s2 = sc.next();
	        max = Integer.MIN_VALUE;
	        
	        int N1 = s1.length();
	        int N2 = s2.length();
	        
	        int[][] dp = new int[N1+1][N2+1];
	        h = new LinkedHashSet<String>();
	        StringBuffer sb = new StringBuffer();
	        
	        for(int i=0; i<=N1; i++)
	            for(int j=0; j<=N2; j++)
	                dp[i][j] = 0;
	                
            for(int i=1; i<=N1; i++)
            {
                for(int j=1; j<=N2; j++)
                {
                    if(s1.charAt(i-1)==s2.charAt(j-1))
                        dp[i][j] = 1 + dp[i-1][j-1];
                    
                    else
                        dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                    
                    if(max<dp[i][j])
                        max = dp[i][j];
                }
            }
            ip=0;
            P(dp,s1,s2,N1,N2,sb);
	        
	        ArrayList al = new ArrayList(h);
	        al.sort(new Comp());
	        
	        for(int i=0; i<al.size(); i++)
	        {
	            System.out.print(al.get(i)+" ");
	        }
	        
	        System.out.println(""+ip);
	    }
	}
}