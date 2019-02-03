//Maximum Sum Increasing Subsequence 

package Algorithms;

import java.util.Scanner;

public class MISS 
{

    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] dp = new int[N];
            int ans = Integer.MIN_VALUE;

            for(int i=0; i<N; i++)
            {
                arr[i] = sc.nextInt();
                dp[i] = -1;
            }

            dp[N-1] = arr[N-1];

            for(int i=N-2; i>=0; i--)
            {
                int max = 0;
                int res = arr[i];
                for(int j=i+1; j<N; j++)
                {
                    if(arr[i]<arr[j] && dp[j]>max)
                    {
                        max = dp[j];
                    }
                }

                dp[i] = res + max;
            }

            for(int i=0; i<N; i++)
            {
                if(ans<dp[i])
                    ans = dp[i];
            }
            System.out.println(ans);
        }
    }
    
}
