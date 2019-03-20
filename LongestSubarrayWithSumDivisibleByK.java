/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Range
{
    int startInd;
    int endInd;

    Range(int startInd, int endInd)
    {
        this.startInd = startInd;
        this.endInd = endInd;
    }
}

public class LongestSubarrayWithSumDivisibleByK {

    public static HashMap<Integer, Range> H(int[] B, int K)
    {
        int N = B.length;
        HashMap<Integer, Range> h = new HashMap<Integer, Range>();
        int[] C = new int[N+1];
        C[0] = 0;

        for(int i=0; i<N; i++)
            C[i+1] = B[i]%K;
        
        for(int i=0; i<C.length; i++)
        {
            if(h.containsKey(C[i]))
            {
                int startInd = h.get(C[i]).startInd;
                Range r = new Range(startInd, i);
                h.replace(C[i], r);
            }

            else
            {
                h.put(C[i], new Range(i,i));
            }
        }

        return h;
    }

    public static int F(int[] A, int K)
    {
        int N = A.length;
        int[] B = new int[N];

        B[0] = A[0];

        for(int i=1; i<N; i++)
            B[i] = A[i] + B[i-1];

        HashMap<Integer, Range> h = H(B,K);

        System.out.println(h);
        return 0;
    }
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];

            for(int i=0; i<N; i++)
                A[i] = sc.nextInt();
            
            int ans = F(A,K);

        }
	}
}