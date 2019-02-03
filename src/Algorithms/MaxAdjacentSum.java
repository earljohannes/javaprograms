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
public class MaxAdjacentSum 
{
    public static int[] arr;
    public static int A(int[] C, int i)
    {
        if(arr[i]>-1)
            return arr[i];
        
        if(i==C.length-1)
        {
            arr[i] = C[i];
            return C[i];
        }
        
        
        if(i==C.length-2)
        {
            arr[i] = Math.max(C[i],C[i+1]);
            return arr[i];
        }
        
        int a = C[i]+ A(C,i+2);
        int b = A(C,i+1);
        
        arr[i] = Math.max(a,b);
        return arr[i];
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-->0)
	    {
	        int N = sc.nextInt();
	        int[] C = new int[N];
	        arr = new int[N];
	        
	        
	        
	        for(int i=0; i<N; i++)
	        {
	            arr[i] = -1;
	            C[i] = sc.nextInt();
	        }
	        
	        System.out.println(A(C,0));
	    }
	}
}