/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.LargestSquareSubMatrix
 */
package Algorithms;

import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class LargestSquareSubMatrix 
{
    public static int LSM(int[][] arr, int n, int m, int N, int M)
    {
        if(n>=N || m>=M)
            return 0;

        if(arr[n][m]==0)
        {
            return 0;
        }
        
        int a = LSM(arr,n+1,m,N,M);
        int b = LSM(arr,n,m+1,N,M);
        int c = LSM(arr,n+1,m+1,N,M);
        
        return 1+Math.min(a,Math.min(b,c));
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-->0)
	    {
	        int N = sc.nextInt();
	        int M = sc.nextInt();
	        int[][] c = new int[N][M];
	        int[][] dp = new int[N][M];
	        int max = Integer.MIN_VALUE;
	        
	        for(int i=0; i<N; i++)
	        {
	            for(int j=0; j<M; j++)
	            {
	                c[i][j] = sc.nextInt();
	                
	                if(i==N-1 || j==M-1)
	                {
    	                if(c[i][j]==0)
    	                    dp[i][j] = 0;
    	                    
    	                else
    	                    dp[i][j] = 1;
	                }
	            }
	        }
	        
	        for(int i=N-2; i>=0; i--)
	        {
	            for(int j=M-2; j>=0; j--)
	            {
	                if(c[i][j]==1)
	                {
	                    int a = dp[i+1][j+1];
	                    int b = dp[i+1][j];
	                    int p = dp[i][j+1];
	                    
	                    dp[i][j] = 1+Math.min(a,Math.min(b,p));
	                }   
	                    
	                else
    	                dp[i][j] = 0;
	            }
	        }
	        
	        for(int i=0; i<N; i++)
	        {
	            for(int j=0; j<M; j++)
	            {
	                if(max<dp[i][j])
	                    max = dp[i][j];
	            }
	        }
	                    
	        System.out.println(max);
	                
	        
	    }
	}
}