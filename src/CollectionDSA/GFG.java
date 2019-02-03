package collectionDSA;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    static int arr[];
    
    public static void rotate(int arr[], int startIndex, int lastIndex)
    {
        if(startIndex>=lastIndex)
            return;
            
        
        int temp = arr[startIndex];
        
        for(int i = startIndex; i<lastIndex; i++)
        {
            arr[i] = arr[i+1];
        }
        
        arr[lastIndex] = temp;
    }
    
    public static void PreToPost(int arr[], int k, int n)
    {
        if(k<0 || n<0)
            return;
            
        if(k>=n)
            return;
            
          
        if(k+1==n)
        {
            int temp = arr[k];
            arr[k] = arr[k+1];
            arr[k+1] = temp;
            return;
        }
        
        int root = arr[k];
        int left = -1;
        int right = -1;
        
        if(arr[k+1]<root)
            left = k+1;
            
        else
            right = k+1;
        
        for(int i = k+1; i<=n; i++)
        {
            if(arr[i]>root)
                right = i;
                
            if(right==i)
                break;
        }
        
        if(right==-1)
            PreToPost(arr, left, n);
            
        else
            PreToPost(arr, left, right-1);
            
        PreToPost(arr, right, n);
        
        rotate(arr,k,n);
    }
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0)
		{
		    int n = sc.nextInt();
		    arr = new int[n+1];
		    
		    for(int i=0; i<n; i++)
		    {
		        arr[i] = sc.nextInt();
		        
		        /*
		        if(arr[i]=="")
		        {
		            System.out.println("NO");
		            System.exit(0);
		        }
		        */
		        
		    }
		    
		    PreToPost(arr, 0, n-1);

		    for(int i = 0; i<n; i++)
                System.out.print(arr[i]+" ");
		   
            System.out.println("");
		    
		}
		
	}
}