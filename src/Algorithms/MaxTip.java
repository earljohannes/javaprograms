/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author Harry
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class MaxTip 
{
    public static int maxTip(int[] R, int[] A, int i, int X, int Y)
    {
        if(i==A.length-1)
        {
            int ans = 0;
            if(X==0 && Y>0)
                ans = A[i];
            
            else if(Y==0 && X>0)
                ans = R[i];
            
            else
                ans = Math.max(R[i],A[i]);
            
            return ans;
        }
        
        int r = -1, a = -1;
        
        if(X>0)
            r = R[i]+maxTip(R,A,i+1,X-1,Y);
        
        
        if(Y>0)
        
            a = A[i]+maxTip(R,A,i+1,X,Y-1);
        

        return Math.max(r,a);
    }
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int[] R = new int[N];
		    int[] A = new int[N];
		    
		    for(int i=0; i<N; i++)
		        R[i] = sc.nextInt();
		        
		    for(int i=0; i<N; i++)
		        A[i] = sc.nextInt();
		    
		    
		    System.out.println(maxTip(R,A,0,X,Y));
		}
	}
}