

import java.util.*;
import java.lang.*;
import java.io.*;

public class NumberStrings 
{
    public static int BottomUpLCS(String x, String y, int m, int n, int[][] matt)
    {
        for(int i=0; i<=m; i++)
        {
            for(int j=0; j<=n; j++)
            {
                if(i==0 || j==0)
                {
                    matt[i][j] = 0;
                }
                
                else
                {
                    if(x.charAt(i-1)==y.charAt(j-1))
                        matt[i][j] = matt[i-1][j-1] + 1;
                    
                    else
                        matt[i][j] = Math.max(matt[i][j-1], matt[i-1][j]);
                }
            }
            
            
        }
        
        return matt[m][n];
    }
        
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-->0)
        {
            //int N = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            int tc = 0;
            
            int m = s1.length();
            int n = s2.length();
            
            int[][] matt = new int[m+1][n+1];
            int[][] cost = new int[m+1][n+1];
            
            for(int i=0; i<=m; i++)
            {
                for(int j=0; j<=n; j++)
                {
                    if(i==0 || j==0)
                    {
                        matt[i][j] = 0;
                    }

                    else
                    {
                        if(s1.charAt(i-1)==s2.charAt(j-1))
                        {
                            matt[i][j] = matt[i-1][j-1] + 1;
                            cost[i][j] = cost[i-1][j-1] + Integer.parseInt(s1.substring(i-1,i));
                        }
                        
                        else
                        {
                            matt[i][j] = Math.max(matt[i][j-1], matt[i-1][j]);
                            cost[i][j] = Math.max(cost[i][j-1], cost[i-1][j]);
                        }
                    }
                }

            }
            
            for(int i=0; i<m; i++)
            {
                tc = tc+ Integer.parseInt(s1.substring(i, i+1))  ;
            }
            
            for(int j=0; j<n; j++)
            {
                tc = tc+ Integer.parseInt(s2.substring(j, j+1))  ;
            }
            
            int ans = tc - 2*cost[m][n];
            
            System.out.println(ans);
        }
    
    }
}
