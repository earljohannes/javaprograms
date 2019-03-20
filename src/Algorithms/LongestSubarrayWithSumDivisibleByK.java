/*package whatever //do not write package name here */
package src.Algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;

class Range
{
    int startInd;
    int endInd;
}

public class LongestSubarrayWithSumDivisibleByK {

    public static HashMap<Integer, Range> H(int[] B, int K)
    {
        int N = B.length;

        int[] C = new int[N+1];
        C[0] = 0;
        for(int i=0; i<N; i++)
        {
            C[i+1] = B[i]%K;
        }

        System.out.println(C);

        return  new HashMap<Integer, Range>();
    }

    public static int F(int[] A, int K)
    {
        int N = A.length;
        int[] B = new int[N];

        B[0] = A[0];

        for(int i=1; i<N; i++)
            B[i] = A[i] + B[i-1];

        HashMap<Integer, Range> h = H(B,K);

        
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