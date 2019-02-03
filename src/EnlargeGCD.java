
import java.util.*;
import java.lang.*;
import java.io.*;

public class EnlargeGCD 
{

    public static int GCD(int a, int b)
    {
        if(a%b==0)
            return b;
        
        else
            return GCD(b,a%b);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        int mingcd = Integer.MAX_VALUE;
        int np=0;
        
        for(int i=0; i<N; i++)
            num[i] = sc.nextInt();
        
        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N; j++)
            {
                int gcd = GCD(num[i],num[j]);
                
                if(mingcd<gcd)
                {
                    mingcd = gcd;
                    np = 0;
                }
                
                if(gcd==mingcd)
                {
                    np++;
                }
                
            }
        }
        
        if(N%2==0)
            System.out.println((np*2));
                    
        else
            System.out.println((np*2-1));
    }
    
}
