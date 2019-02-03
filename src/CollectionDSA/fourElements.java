/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionDSA;

import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class fourElements 
{
    public static boolean tgl;
    
    public static void isFE(int[] A, int i, int st, int sum, int X)
    {
        if(tgl)
            return;
        
        if(sum>X)
            return;
        
        if(i==4)
        {
            //System.out.println("chala : "+sum);
            if(sum==X)
            {
                tgl = true;
                //System.out.println("chala : "+st);
            }
            return;
        }
        
        for(int j=st; j<A.length; j++)
        {
            if(A[j]<=X)
            {
                sum = sum+A[j];
                //System.out.println("inner for : "+A[j]);
                isFE(A, i+1, j+1, sum, X);
                sum = sum-A[j];
            }
        }
    }
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    int[] A = new int[N];
		    tgl = false;
		    
		    for(int i=0; i<N; i++)
		        A[i] = sc.nextInt();
		        
		    
		        
		    int X = sc.nextInt();
		    //System.out.println(X);
		    
		    isFE(A,0,0,0,X);
		    
		    int i = tgl ? 1 : 0 ;
		    System.out.println(i);
		}
	}
}