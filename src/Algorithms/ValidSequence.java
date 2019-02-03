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

public class ValidSequence 
{
    public static boolean tgr;
    public static int[][] mat;
    
    public static int VS(int[] A, int i, int sum, int k)
    {
        if(tgr)
            return 1;
        
        if(sum>=0)
            if(mat[i][Math.abs(sum)]>-1)
                return mat[i][Math.abs(sum)];
            
        //System.out.println(i+" "+sum);
        
        if(i==A.length)
        {
            if(sum%k==0)
            {
                if(sum>=0)
                    mat[i][Math.abs(sum)] = 1;
                
                tgr = true;
                return 1;
            }
            
            else
            {
                if(sum>=0)
                    mat[i][Math.abs(sum)] = 0;
                
                return 0;
            }
        }
        
        while(A[i]==0 && i<A.length-1)
            i++;
        
        int ans = VS(A,i+1,sum+A[i],k) | VS(A,i+1,sum-A[i],k);
        
        
        mat[i][Math.abs(sum)] = ans;
        
        return ans;
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int[] A = new int[N];
		    tgr = false;
		    mat = new int[N+1][1000];
		    
		    for(int i=0; i<=N; i++)
		        for(int j=0; j<1000; j++)
		            mat[i][j] = -1;
		    
		    for(int i=0; i<N; i++)
		        A[i] = sc.nextInt();
		        
		    int k = sc.nextInt();
		    
		    System.out.println(VS(A,1,A[0],k));
		    
		}
	}
}