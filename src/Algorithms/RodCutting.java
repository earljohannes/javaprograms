
package Algorithms;

import java.util.Scanner;

public class RodCutting 
{
    public static int cut(int N,int x,int y,int z)
    {
        
        if(N<0)
        {
            return -10000;
        }
        
        if(mat[N]>-100)
            return mat[N];
        
        
        if(N==0)
        {
            mat[N] = 0;
            return mat[N];
        }
        
        int a = cut(N-x, x, y, z);
        int b = cut(N-y, x, y, z);
        int c = cut(N-z, x, y, z);
        
        mat[N] = 1 + Math.max(a,Math.max(b,c));
        return mat[N];
    }
    
    public static int[] mat;
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    while(T-->0)
	    {
	        int N = sc.nextInt();
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        int z = sc.nextInt();
	        
	        /*
	        mat = new int[N+1];
	        for(int i=0; i<=N; i++)
	            mat[i] = -100;
	        */
	        
	        System.out.println(cut(N,x,y,z));
	        
	    }
	}
}