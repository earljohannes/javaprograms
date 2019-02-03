
package Algorithms;

import java.util.Scanner;

public class CountEvenLength 
{
    

    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N = sc.nextInt();
            long ans = 1;
            float nCr = 1;
            long mod = 1000000007;

            for(int i=0; i<N; i++)
            {
                nCr = (N-i)*nCr*( (float) 1/(i+1) );

                ans = ans + (long)(nCr*nCr);
            }
            
            System.out.println(ans);

        }
    
    }
}
