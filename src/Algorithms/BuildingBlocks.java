
package Algorithms;

/*   Aditya and his building blocks    */

import java.util.*;
import java.lang.*;
import java.io.*;

class BuildingBlocks 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] A = new int[N];
            PriorityQueue<Integer> q = new PriorityQueue<Integer>(N);

            for(int i=0; i<N; i++)
            {
                A[i] = sc.nextInt();
                q.add(A[i]);
            }

            while(q.size()>0 && M>0)
            {
                int k = (Integer) q.remove();
                k++;
                q.add(k);
                M--;
            }

            System.out.println(q.remove());
        }
    }
}
