/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;



public class SubarrayGivenSum {

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
            
            int sum = 0, stInd = 0, endInd = 0, i=0;
            
            while(true)
            {
                if(sum<K)
                {
                    if(endInd<N)
                        sum = sum+A[endInd++];
                    //System.out.println(stInd+" "+endInd+" "+sum);
                }

                else if(sum>K)
                {
                    if(stInd<N)
                        sum = sum-A[stInd++];
                    //System.out.println(stInd+" "+endInd+" "+sum);
                }

                else
                    break;

                if(stInd==N && endInd==N)
                    break;

            }

            System.out.println(++stInd+" "+endInd);

        }
	}
}