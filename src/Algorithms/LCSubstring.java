
package Algorithms;

import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class LCSubstring 
{
    public static int MaxDiagonal(int[][] mat, int i, int j, int N1, int N2)
    {
        int ans = 1;
        for(int k=1; k<=N1-i && k<=N2-j; k++)
        {
            if(mat[i+k][j+k]==0)
                break;
            
            else
                ans++;
        }
        return ans;
    }
    
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N1 = sc.nextInt();
            int N2 = sc.nextInt();
            int[][] mat = new int[N1+1][N2+1];
            int max = Integer.MIN_VALUE;

            String s1 = sc.next();
            String s2 = sc.next();

            for(int i=0; i<=N1; i++)
            {
                for(int j=0; j<=N2; j++)
                {
                    if(i==0 || j==0)
                        mat[i][j] = 0;

                    else if(s1.charAt(i-1)==s2.charAt(j-1))
                        mat[i][j] = 1;

                    else
                        mat[i][j] = 0;
                }
            }


            int res = 0;
            for(int i=0; i<=N1; i++)
            {
                for(int j=0; j<=N2; j++)
                {
                    if(mat[i][j]==0)
                        res = 0;

                    else
                        res = MaxDiagonal(mat,i,j,N1,N2);

                    if(max<res)
                        max = res;
                }
            }

            System.out.println(max);
        }
    }
}