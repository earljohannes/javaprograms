
package Algorithms;

import java.util.Scanner;


public class FencePainting 
{
    public static int C(int n, int k)
    {
        if(arr[n]>-1)
            return arr[n];

        if(n==1)
        {
            arr[n] = k;
            return arr[n];
        }
            
        if(n==2)
        {
            arr[n] = k*k;
            return arr[n];
        }
            
        arr[n] = (k-1)*(C(n-1,k) + C(n-2,k));
        
        
        return arr[n];
    }
    
    public static int[] arr;
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0)
	    {
	        int N = sc.nextInt();
	        int K = sc.nextInt();
	        
	        arr = new int[N+1];
	        for(int i=0; i<=N; i++)
	        {
	            arr[i] = -1;
	        }
	        
	        System.out.println(C(N,K));
	        
	    }
	}
}
