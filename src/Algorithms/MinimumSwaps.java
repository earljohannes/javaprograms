/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

//Minimum Swaps required to group all 1’s together

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumSwaps 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            int[] A = new int[N];
            int x = 0, cuMax = 0, ans =0, maxOnes = Integer.MIN_VALUE;

            for(int i=0; i<N; i++)
            {
                A[i] = sc.nextInt();

                if(A[i]==1)
                    x++;
            }

            for(int i=0; i<x; i++)
            {
                if(A[i]==1)
                    cuMax++;

            }

            maxOnes = Math.max(maxOnes,cuMax);

            for(int i=0; i<N-x; i++)
            {
                cuMax = cuMax - A[i] + A[x+i];
                maxOnes = Math.max(maxOnes, cuMax);
            }

            if(x==0)
                ans = -1;
            else
                ans = x-maxOnes;

            System.out.println(ans);

        }
    }
}