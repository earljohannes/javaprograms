/*
Longest sub-array having sum k
 */
package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarray 
{
    public static int LongestSubarray(int[] A, int N, int K)
    {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        int sum = 0, maxLen = 0;
        
        for(int i=0; i<N; i++)
        {
            sum = sum + A[i];
            
            if(sum==K)
                maxLen = i+1;
            
            if(!h.containsKey(sum))
                h.put(sum, i);
            
            if(h.containsKey(sum-K))
            {
                if(maxLen < i-h.get(sum-K))
                    maxLen = i-h.get(sum-K);
            }
            System.out.println(h+"  "+maxLen);
        }
        
        return maxLen;
    }


    public static void main(String[] args) 
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
            
            System.out.println(LongestSubarray(A, N, K));
            
            
        }
    }
    
}
