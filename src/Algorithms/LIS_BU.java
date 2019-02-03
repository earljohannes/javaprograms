
package Algorithms;

import java.util.Scanner;

public class LIS_BU 
{

    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            if(N==0)
                System.out.println("0");

            if(N==0)
                continue;

            int[] arr = new int[N];
            int[] dp = new int[N];
            int res = Integer.MIN_VALUE;

            for(int i=0; i<N; i++)
            {
                arr[i] = sc.nextInt();
                dp[i] = -1;
            }

            dp[N-1] = 1;
            for(int i=N-2; i>=0; i--)
            {
                int max = 0;
                for(int j=i+1; j<N; j++)
                {
                    if(arr[i]<arr[j])
                    {
                        if(dp[j]>max)
                            max = dp[j];
                    }

                }

                dp[i] = 1+ max;
            }

            for(int i=0; i<N; i++)
            {
                if(dp[i]>res)
                    res = dp[i];
            }

            System.out.println(res);
        }
    }
    
}
