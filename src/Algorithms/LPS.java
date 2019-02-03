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
public class LPS 
{
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    String s1 = sc.next();
		    int N = s1.length();
		    
		    StringBuffer sb = new StringBuffer(s1);
		    String s2 = new String(sb.reverse());
		    
		    int[][] dp = new int[N+1][N+1];
		    int min = Integer.MAX_VALUE;
		    
		    
		    for(int i=0; i<=N; i++)
            {
                for(int j=0; j<=N; j++)
                {
                    if(i==0 || j==0)
                    {
                        dp[i][j] = 0;
                    }
                    
                    else
                    {
                        if(s1.charAt(i-1)==s2.charAt(j-1))
                            dp[i][j] = dp[i-1][j-1] + 1;
                        
                        else
                            dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                    }
                    
                }
                
                
            }
            
            System.out.println(dp[N][N]);
		}
	}
}