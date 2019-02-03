
package Algorithms;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class LongestIncreasingSubsequences 
{
    public static int[] mat;
    public static int LIS(int[] arr, int ind)
    {
        if(mat[ind]>-1)
            return mat[ind];
        
        int res=0, max=0;
        for(int i=ind; i<arr.length; i++)
        {
            if(arr[i]>arr[ind])
            {
                res = 1+ LIS(arr,i);
                
                if(res>max)
                {
                    max = res;
                }
            }
        }
        return max;
    }
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int max=0,res=0;
		    int N = sc.nextInt();
		    int[] arr = new int[N];
		    mat = new int[N+1];
		    
		    for(int i=0; i<N; i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    
		    for(int i=0; i<=N; i++)
		    {
		        mat[i] = -1;
		    }
		    
		    for(int i=0; i<N; i++)
		    {
		        res = LIS(arr,i);
		        
		        if(res>max)
		        {
		            max = res;
		        }
		        
		    }
		    
		    max++;
		    System.out.println(max);
		    
		}
	}
}