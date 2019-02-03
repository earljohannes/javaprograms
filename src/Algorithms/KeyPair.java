/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.*;
import java.lang.*;
import java.io.*;

class KeyPair 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
            boolean tgl = false;

            for(int i=0; i<N; i++)
            {
                int a = sc.nextInt();
                

                if(h.containsKey(a))
                {
                    int v = h.get(a);
                    v++;
                    h.replace(a,v);
                }

                else
                {
                    h.put(a,1);
                }

                if(h.containsKey(K-a))
                {
                    if(K-a!=a || h.get(a)>1)
                    {
                        tgl = true;
                    }

                }

                if(tgl)
                    break;

            }

            String ans = tgl?"Yes" : "No";
            
            System.out.println(ans);

            }
    }
}