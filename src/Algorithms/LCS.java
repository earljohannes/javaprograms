
package Algorithms;

public class LCS 
{
    public static int[][] mat;
    
    public static int TopDownLCS(String x, String y, int m, int n)
    {
        if(mat[m][n]>-1)
            return mat[m][n];
        
        if(m<=0 || n<=0)
        {
            mat[m][n] = 0;
            return mat[m][n];
        }
        
        if(x.charAt(m-1)==y.charAt(n-1))
        {
            mat[m][n] = 1+ TopDownLCS(x, y, m-1, n-1);
            return mat[m][n];
        }
        
        else
        {
            mat[m][n] = Math.max( TopDownLCS(x, y, m-1, n), TopDownLCS(x, y, m, n-1));
            return mat[m][n];
        }
        
    }
    
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
        String a = "aaaaaaaaaaaaaa";
        String b = "aaaabbbbbbbbbb";
        
        int m = a.length();
        int n = b.length();
        
        mat = new int[m+1][n+1];
        int[][] matt = new int[m+1][n+1];
        
        
        
        
        for(int i=0; i<= m; i++)
            for(int j=0; j <=n; j++)
                mat[i][j] = -1;
        
        System.out.println("Using Top Down : "+TopDownLCS(a, b, m, n));
        
        System.out.println("Using Bottom Up : "+BottomUpLCS(a, b, m, n, matt));
        

    }
    
}
