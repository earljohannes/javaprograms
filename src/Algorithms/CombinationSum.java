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
public class CombinationSum 
{
    public static LinkedHashSet<String> h;
    public static boolean[][] mat;
    
    public static void combination(int[] A, int B)
    {
        h = new LinkedHashSet<String>();
        StringBuffer s = new StringBuffer();
        mat = new boolean[30][30];
        
        /*
        for(int i=0; i<B; i++)
            for(int j=0; j<B; j++)
                mat[i][j] = false;
                
        */
        
        CombSum(A,s,B,0);
        
        if(h.isEmpty())
            System.out.print("Empty");
        
        Iterator itr = h.iterator();
        while(itr.hasNext())
        {
            String str = (String) itr.next();
            System.out.print("("+str.trim()+")");
        }
        
        /*
        for(int i=0; i<h.size(); i++)
        {
            String str = (String) al.get(i);
            System.out.print("("+str.trim()+")");
        }
        */
        
    }
    
    public static void CombSum(int[] A, StringBuffer sb, int B, int i)
    {
        if(B==0)
        {
            String str = new String(sb);
            h.add(str);
        }
        
        if(A[i]>B)
            return;
        
        sb.append(A[i]+" ");
        
        CombSum(A,sb,B-A[i],i);
        
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(sb.length()-1);
        
        if(i<A.length-1)
            CombSum(A,sb,B,i+1);
        
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
	        {
	            A[i] = sc.nextInt();
	        }
	        
	        Arrays.sort(A);
	        
	        int B = sc.nextInt();
	        combination(A,B);
	        System.out.println("");
	        
	    }
	    
	}
}