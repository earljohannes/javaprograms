
package Algorithms;


public class MatrixMultiplication_DP 
{

    public static int MatriXChain(int[] p)
    {
        int n = p.length-1;
        int[][] m = new int[n+1][n+1];
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                m[i][j] = Integer.MAX_VALUE;
            }
        }
        
        return LookUpChain(m,p,1,n);
    }
    
    public static int LookUpChain(int[][] m, int[] p, int i, int j)
    {
        /*
        if(m[i][j]<Integer.MAX_VALUE)
            return m[i][j];
        */
        if(i==j)
            return 0;
        
        else
        {
            for(int k=i; k<j; k++)
            {
                int q = LookUpChain(m,p,i,k) + LookUpChain(m,p,k+1,j) + p[i-1]*p[j]*p[k];
                
                if(q<m[i][j])
                    m[i][j] = q;
            }
        }
        
        return m[i][j];
    }

    public static void main(String[] args) 
    {
        int[] p ={1, 2, 3, 4};
        int a = MatriXChain(p);
        System.out.println(""+a);
    }
    
}
