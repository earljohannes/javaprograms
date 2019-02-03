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
public class MinimumEditDistance 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int N1 = sc.nextInt();
		    int N2 = sc.nextInt();
		    String s1 = sc.next();
		    String s2 = sc.next();
		    
		    int[][] dp = new int[N1+1][N2+1];
		    int min = Integer.MAX_VALUE;
		    
		    for(int i=0; i<=N1; i++)
		        for(int j=0; j<=N2; j++)
		            dp[i][j] = 0;
		            
		    for(int i=0; i<=N1; i++)
		    {
		        for(int j=0; j<=N2; j++)
		        {
		            if (i==0)
		                dp[i][j] = j;
		                
		            else if (j==0)
		                dp[i][j] = i;
		                
		            else if(s1.charAt(i-1)==s2.charAt(j-1))
		                dp[i][j] = dp[i-1][j-1];
		                
		            else
		                dp[i][j] = 1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));        
		                
		        }
		    }
		    
		    System.out.println(dp[N1][N2]);
		}
	}
}