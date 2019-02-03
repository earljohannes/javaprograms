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

public class GoldMine 
{
    public static int[][] mat;
    
    public static int A(int[][] M, int n, int m, int a, int b)
    {
        if(a<0 || a>n)
        {
            return 0;
        }
        
        
        if(mat[a][b]>-1)
            return mat[a][b];
        
        if(a==n)
        {
            mat[a][b] = 0;
            return mat[a][b];
        }
        
        if(b>=m)
        {
            mat[a][b] = 0;
            return mat[a][b];
        }
        
        
        if(b==m-1)
        {
            mat[a][b] = M[a][b];
            return mat[a][b];
        }
        
        mat[a][b] = M[a][b] + Math.max(Math.max(A(M,n,m,a-1,b+1), A(M, n, m, a+1, b+1)), A(M, n, m, a, b+1));

        return mat[a][b];
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-->0)
	    {
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        int[][] M = new int[n][m];
	        mat = new int[n+1][m+1];
	        int max = Integer.MIN_VALUE;
	        
	        for(int i=0; i<n; i++)
	            for(int j=0; j<m; j++)
	                M[i][j] = sc.nextInt();
	                
	        for(int i=0; i<=n; i++)
	            for(int j=0; j<=m; j++)
	                mat[i][j] = -1;
	                
	        int res;
                
	        for(int i=n-1; i>=0; i--)
	        {
                    res = A(M, n, m, i, 0);
    	        
                    if(res>max)
                    {
                        max = res;
                    }
                    
                    System.out.println(max+" "+res);
                    
	        }
	        
	        
	        
	        System.out.println(max);
	    }
	}
}