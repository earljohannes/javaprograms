/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair_Sum_Divisibility {
    
    public static HashMap<Integer, Integer> H(int[] A, int K)
    {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

        for(int i = 0; i< A.length; i++)
        {
            if(h.containsKey(A[i]))
            {
                int v = h.get(A[i]);
                h.replace(A[i], ++v);
            }

            else
            {
                h.put(A[i], 1);
            }
        
        }
        //System.out.println(h);
        return h;
    }

    public static boolean F(int[] B, int K)
    {
        HashMap<Integer, Integer> h = H(B, K);

        for(int i=0; i<B.length; i++)
        {
            
            if((B[i]) == 0)
            {
                //System.out.println("chala 1 "+h.get(0));
                if(h.get(0)%2 != 0)
                    return false;
            }

            else
            {
                if(h.containsKey(K-B[i]))
                {
                    //System.out.println("chala 21");
                    if(h.get(B[i]) != h.get(K-B[i]))
                        return false;

                }

                else
                    return false;
            }   
        }


        return true;
    }
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
		    
		    for(int i=0; i<N; i++)
		        A[i] = sc.nextInt();
		    
            int K = sc.nextInt();
            
            for(int i=0; i<N; i++)
                B[i] = A[i]%K;
		    
            String ans = F(B,K) ? "True" : "False";
            System.out.println(ans);
		}
	}
}