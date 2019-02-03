/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class Arrays_factorial 
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N = sc.nextInt();
            int[] A = new int[2572];
            A[0] = 1;


            for(int i=1; i<=N; i++)
            {
                int carry = 0;
                for(int j=0; j<2571; j++)
                {
                    int k = A[j];
                    int p = (k*i) + carry;
                    int rem = p%10;
                    A[j] = rem;
                    carry = p/10;
                }

            }


            int fd = 0;
            int j = 2571;
            int lz = 0;

            while(A[j]==0)
            {
                j--;
                lz++;
            }


            System.out.println(A[j]+" "+(2571-lz));
        }
    }
}
/*
    ArrayList al = new ArrayList();
    al.add(1);
    for(int i=1; i<=N; i++)
    {
        int carry = 0;
        for(int j=0; j<N; j++)
        {
            int k = (Integer) al.remove(j);
            int p = (k*i) + carry;
            int rem = p%10;
            al.add(j,rem);
            carry = p/10;
        }
        
        System.out.println(al);
    }

*/