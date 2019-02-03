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
public class KnapsackCost 
{
    public static int[][] mat;
    public static int Cost(int[] cost, int W, int i, int N)
    {
        if(mat[W][i]>0)
            return mat[W][i];
        
        if(W==0)
        {
            //mat[W][i] = 0;
            return 0;
        }
        
        if(cost[i]==-1)
        {
            mat[W][i] = 100000000;
            return 100000000;
        }
        
        if(i>W && W!=0)
        {
            return 100000000;
        }
        
        int a = 100000000, b = 100000000;
        
        if(cost[i]!=-1)
            a = Cost(cost, W-i, i, N) + cost[i];
        
        
        if(i<N)
            b = Cost(cost, W, i+1, N);
        
        mat[W][i] = Math.min(a,b);
        return mat[W][i];
    }
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int W = sc.nextInt();
		    mat = new int[W+1][N+1];
		    
		    int[] cost = new int[N+1];
		    for(int i=1; i<=N; i++)
		        cost[i] = sc.nextInt();
		        
		    for(int i=0; i<=W; i++)
		        for(int j=0; j<=N; j++)
		            mat[i][j] = 0;
		            
		            
		    int ans = Cost(cost,W,1,N);
		    
		    if(ans<100000000)
		        System.out.println(ans);
		    
		    else
		        System.out.println("-1");
		    
		}
	}
}