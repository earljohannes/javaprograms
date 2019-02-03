/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class AdjacentNotAllowed 
{
    public static int[] arr;
    public static int ANA(int[][] grid, int N,int j)
    {
        if(arr[j]>-1)
            return arr[j];
        
        if(j==N-1)
        {
            arr[j] = Math.max(grid[0][j],grid[1][j]);
            return arr[j];
        }
        
        if(j==N-2)
        {
            int a = Math.max(grid[0][N-1],grid[1][N-1]);
            int b = Math.max(grid[0][N-2],grid[1][N-2]);
            arr[j] = Math.max(a,b);
            return arr[j];
        }
        
        int res = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=j+2; i<N; i++)
        {
            res = ANA(grid, N, i);
            if(res>max)
                max = res;
        }
        
        arr[j] = max+ Math.max(grid[0][j], grid[1][j]);
        return arr[j];
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int[][] grid = new int[2][N];
		    int[] dp = new int[N];
		    arr = new int[N];
		    int max = Integer.MIN_VALUE;
		    
		    for(int i=0; i<2; i++)
		    {
		        for(int j=0; j<N; j++)
		        {
		            grid[i][j] = sc.nextInt();
		            arr[j] = Integer.MIN_VALUE;
		        }
		    }
		    
		    for(int i=0; i<N; i++)
		    {
		        int res = ANA(grid,N,i);
		        if(res>max)
		            max = res;
		    }
		    
		    //dp[N-1] = Math.max(arr[0][N-1],arr[1][N-1]);
            System.out.println(max);
		}
	}
}
