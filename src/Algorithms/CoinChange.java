
package Algorithms;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class CoinChange 
{
    
    public static int count;
    public static int[][][] mat;
    
    public static int A(int[] arr, int N, int st, int lst)
    {
        if(mat[N][st][lst] > -1)
            return mat[N][st][lst];
            
        
        if(st==lst)
        {
            if(N%arr[lst]==0)
            {
                count++;
                mat[N][st][lst] = 1;
                return mat[N][st][lst];
            }
            
            else
            {
                mat[N][st][lst] = 0;
                return 0;
            }
        }
        
        int fact = (N-(N%arr[lst]))/arr[lst];
        int x = 0;
        
        for(int i=fact; i>=0; i--)
        {
            int p = N - (i*arr[lst]);
            x = x + A(arr, p, 0, lst-1);
        }
        
        mat[N][st][lst] = x;
        return mat[N][st][lst];
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-->0)
	    {
	        count = 0;
	        int M = sc.nextInt();
	        int[] arr = new int[M];
	        
	        
	        for(int i=0; i<M; i++)
	            arr[i] = sc.nextInt();
	        
	        int N = sc.nextInt();
	        
	        mat = new int[N+1][M][M];
	        
	        for(int i=0; i<=N; i++)
	            for(int j=0; j<M; j++)
	                for(int k=0; k<M; k++)
	                    mat[i][j][k] = -1;
	                    
	        
	        
	        Arrays.sort(arr);
	        
	        int x = A(arr, N, 0, arr.length-1);
	        
	        System.out.println(x);
	    }
	}
}