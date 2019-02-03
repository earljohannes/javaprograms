
package Algorithms;

import java.util.Scanner;

public class LRS 
{
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    String s = sc.next();
		    
		    int[][] mat = new int[N+1][N+1];
		    
		    for(int i=0; i<=N; i++)
		    {
		        for(int j=0; j<=N; j++)
		        {
		            if(i==0 || j==0)
		                mat[i][j] = 0;
		        }
		    }
		    
		    for(int i=1; i<=N; i++)
		    {
		        for(int j=1; j<=N; j++)
		        {
	                if(s.charAt(i-1)==s.charAt(j-1) && i!=j)
	                {
	                    mat[i][j] = 1+mat[i-1][j-1];
	                }
	                
	                else
	                {
	                    mat[i][j] = Math.max(mat[i][j-1],mat[i-1][j]);         
	                }
		            
		        }
		    }
		    
		    System.out.println(mat[N][N]);
		}
	}
}