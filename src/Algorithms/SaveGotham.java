/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class SaveGotham 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N = sc.nextInt();
            int[] A = new int[N];
            int sum = 0;

            for(int i=0; i<N; i++)
                A[i] = sc.nextInt();

            Stack<Integer> s = new Stack<Integer>();

            s.add(A[0]);

            int i = 1;
            while(i<N)
            {
                while(A[i]>s.peek() && s.size()>0)
                {
                    sum = sum + A[i];
                    s.pop();

                    if(s.size()==0)
                        break;
                }

                s.add(A[i]);
                i++;

            }

            System.out.println(sum);
        }

    }
}