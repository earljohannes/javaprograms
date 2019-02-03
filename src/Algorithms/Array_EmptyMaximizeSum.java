/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class Array_EmptyMaximizeSum 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N = sc.nextInt();
            int[] A = new int[N];
            ArrayList al = new ArrayList(N);
            int sum = 0;

            for(int i=0; i<N; i++)
            {
                int k = sc.nextInt();
                al.add(k);
                //A[i] = sc.nextInt();
            }

            Collections.sort(al);

            while(al.size()>1)
            {
                int i = (Integer) al.remove(al.size()-1);
                int j = Collections.binarySearch(al,i-1);

                sum = sum+i;

                if(j>-1 && al.size()>0)
                    al.remove(j);

            }

            if(al.size()>0)
                sum = sum + (Integer) al.remove(0);

            System.out.println(sum);
        }

    }
}