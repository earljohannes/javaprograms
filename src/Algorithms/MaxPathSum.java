
package Algorithms;

import java.util.Scanner;


public class MaxPathSum 
{
    public static int[][] mat;
    public static int MaxPath(int[][] A, int i, int j, int N)
    {
        if(j>=N || j<0)
            return -1;
        
        if(mat[i][j]>-1)
            return mat[i][j];
    
        if(i==N-1)
        {
            mat[i][j] = A[i][j];
            return A[i][j];
        }
        
        int a = MaxPath(A,i+1,j,N);
        int b = MaxPath(A,i+1,j+1,N);
        int c = MaxPath(A,i+1,j-1,N);
        
        mat[i][j] = A[i][j] + Math.max(a,Math.max(b,c));
        return mat[i][j];
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-->0)
	    {
	        int N = sc.nextInt();
	        int[][] A = new int[N][N];
	        int[][] dp = new int[N][N];
	        mat = new int[N][N];
	        int max = Integer.MIN_VALUE;
	        
	        for(int i=0; i<N; i++)
	        {
	            for(int j=0; j<N; j++)
	            {
	                A[i][j] = sc.nextInt();
	                mat[i][j] = -10;
	                
	                if(i==N-1 || j==N-1)
	                    dp[i][j] = A[i][j];
	                    
	            }
	        }
	        
	        /*
	        for(int i=N-2; i>=0; i--)
	        {
	            for(int j=N-2; j>=0; j--)
	            {
	                dp[i][j] = A[i][j]+ Math.max(dp[i+1][j],Math.max(dp[i+1][j+1],dp[i+1][j-1]));
	                if(dp[i][j]>max)
	                    max = dp[i][j];
	            }
	        }
	        */
	        
	        for(int k=0; k<N; k++)
	        {
	            int res = MaxPath(A,0,k,N);
	            
	            if(res>max)
	                max = res;
	        }
	        
	        
	        System.out.println(max);
	        
	    }
	}
}
