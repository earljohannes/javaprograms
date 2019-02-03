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
public class Vessels 
{
    public static boolean toggle;
    
    public static void CV(int[] V, int sum, int i, int K)
    {
        if(toggle)
            return;
        
        if(i==V.length)
            return;
        
        if(sum>K)
            return;
        
        if(sum==K)
        {
            toggle = true;
            return;
        }
        
        CV(V, sum+V[i], i, K);
        CV(V, sum, i+1, K);
    }
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int K = sc.nextInt();
		    int[] V = new int[N];
		    toggle = false;
		    
		    for(int i=0; i<N; i++)
		    {
		        V[i] = sc.nextInt();
		    }
		    
		    CV(V,0,0,K);
		    
		    int ans = toggle ? 1 : 0;
		    System.out.println(ans);
		    
		}
		
	}
}