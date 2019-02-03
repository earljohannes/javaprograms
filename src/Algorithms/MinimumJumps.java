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
public class MinimumJumps 
{
    public static int[] arr;
    
    public static int MJ(int[] A, int i, int N)
    {
        if(arr[i]>-1)
            return arr[i];
        
        if(i==N-1)
            return 0;
        
        if(A[i]+i>=N-1)
        {
            arr[i] = 1;
            return 1;
        }
            
        if(A[i]==0)
            return 10000000;
            
        
        int min = 10000000;
        
        for(int j=1; j<=A[i]; j++)
        {
            int res = MJ(A,i+j,N);
            if(min>res)
                min = res;
        }
        
        arr[i] = 1+min;
        return arr[i];
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-->0)
	    {
	        int N = sc.nextInt();
	        int[] A = new int[N];
	        int[] dp = new int[N];
	        arr = new int[N+1];
	        
	        for(int i=0; i<N; i++)
	            A[i] = sc.nextInt();
	            
	        for(int i=0; i<=N; i++)
	            arr[i] = -1;
	            
	            
	        int res = MJ(A,0,N);
	        if(res<100000)
    	        System.out.println(res);
    	        
    	    else
    	        System.out.println("-1");

	        /*dp[N-1] = 0;
	        for(int i=N-2; i>=0; i--)
	            if(arr[i]>=N-1-i)
	                dp[i] = 1;
	        */
	        
	    }
	}
}