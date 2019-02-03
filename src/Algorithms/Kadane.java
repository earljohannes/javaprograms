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
public class Kadane 
{
    public static int Kadane(int[] A)
    {
        int n = A.length;
        
        int m = A[0];
        int cm = A[0];
        
        for(int i=1; i<n; i++)
        {
            cm = Math.max(A[i],A[i]+cm);
            m = Math.max(m,cm);
        }
        
        return m;
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int[] A = new int[N];
		    
		    for(int i=0; i<N; i++)
		        A[i] = sc.nextInt();
		  
		    System.out.println(Kadane(A));
		    
		}
	}
}