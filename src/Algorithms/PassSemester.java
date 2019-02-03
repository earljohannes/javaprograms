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

public class PassSemester 
{
    public static int[][] mat;
    public static boolean ans;
    public static int h;
    public static int max;
    public static int N;
    public static int H;
    public static int P;
    
    public static int willPass(int[] U, int[] V, int t, int m, int i)
    {
        if(mat[t][m]>-1)
            return mat[t][m];
        
        if(t>H)
        {
            return Integer.MIN_VALUE;
        }
        
        if(i==N)
        {
            if(m>=P && t<=H)
            {
                ans = true;
                
                if(m>max)
                {
                    max = m;
                    h = t;
                }
                
                mat[t][m] = m;
                return m;
            }
            
            else
                return Integer.MIN_VALUE;
        }
        
        mat[t][m] = Math.max(willPass(U,V,t+U[i],m+V[i],i+1),willPass(U,V,t,m,i+1));
        return mat[t][m];
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    N = sc.nextInt();
		    H = sc.nextInt();
		    P = sc.nextInt();
		    int[] U = new int[N];
		    int[] V = new int[N];
		    mat = new int[1000][1000];
		    
		    ans = false;
		    max = Integer.MIN_VALUE;
		    h = 0;
		    
		    for(int i=0; i<N; i++)
		    {
		        U[i] = sc.nextInt();
		        V[i] = sc.nextInt();
		    }
		    
		    for(int i=0; i<1000; i++)
		        for(int j=0; j<1000; j++)
		            mat[i][j] = -1;
		    
		    int m = willPass(U,V,0,0,0);
		    String s = ans ? "YES "+h : "NO";
		    
		    System.out.println(s);
		    
		    
		}
	}
}