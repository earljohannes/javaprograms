package Algorithms;

import java.util.Scanner;

class GFG 
{
    
    public static void boggleWord(String[][] boggle, StringBuffer s, int i, int j, int N, int M)
    {
        if(i>=N || j>=M)
            return;
        
        if(i<0 || j<0)
            return;
        
        
        
    }
    
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
		while(T-->0)
		{
		    int A = sc.nextInt();
		    String[] arr = new String[A];
		    
		    for(int i=0; i<A; i++)
		    {
		        arr[i] = sc.next();
		    }
		    
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		    String[][] boggle = new String[N][M];
		    
		    for(int i=0; i<N; i++)
		    {
		        for(int j=0; j<M; j++)
		        {
		            boggle[i][j] = sc.next();
		        }
		    }       
		            
		    
		}
	}
}