/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class CombinationSum2 
{
    public static LinkedHashSet<String> h;
    public static void Combination(int[] A, int B)
    {
        h = new LinkedHashSet<String>();
        StringBuffer sb = new StringBuffer();
        
        CombSum(A,B,0,sb);
        
        if(h.isEmpty())
            System.out.print("Empty");
        
        Iterator itr = h.iterator();
        while(itr.hasNext())
        {
            String str = (String) itr.next();
            System.out.print("("+str.trim()+")");
        }
    }
    
    public static void CombSum(int[] A, int B, int i, StringBuffer sb)
    {
        if(A.length==i && B!=0)
        return;
        
        if(B==0)
        {
            String str = new String(sb);
            h.add(str);
            return;
        }
        
        if(A[i]>B && B!=0)
            return;
        
        if(i<A.length)
        {
            sb.append(A[i]+" ");
            CombSum(A,B-A[i],i+1,sb);
            sb.deleteCharAt(sb.length()-1);
            sb.deleteCharAt(sb.length()-1);
        }
        
        if(i<A.length-1)
            CombSum(A,B,i+1,sb);
        
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int[] A = new int[N];
		    
		    for(int i=0; i<N; i++)
		        A[i] = sc.nextInt();
		        
            int B = sc.nextInt();
            Arrays.sort(A);
            
	        Combination(A,B);
	        
	        System.out.println("");
		}
	}
}