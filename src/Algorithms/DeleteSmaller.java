/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Harry
 */
public class DeleteSmaller 
{
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
		    
		    int K = sc.nextInt();
		    int count = 0;
		    
		    Stack<Integer> s = new Stack<Integer>();
		    s.push(A[0]);
		    
		    for(int i=1; i<N; i++)
		    {
		        while(!s.isEmpty() && (Integer) s.peek()<A[i] && count<K)
		        {
		            s.pop();
		            count++;
		        }
		        
		        s.push(A[i]);
		    }
		    
		    int lim = s.size();
		    
		    for(int i=s.size()-1; i>=0; i--)
		        A[i] = (Integer) s.pop();
		        
		    for(int i=0; i<lim; i++)
		        System.out.print(A[i]+" ");
		        
		    System.out.println("");
		}
	}
}
