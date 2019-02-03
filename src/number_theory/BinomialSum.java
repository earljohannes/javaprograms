
package number_theory;

import java.util.Scanner;
import java.math.BigDecimal;

public class BinomialSum 
{
    public static int[] c;
    
    public static int C(int N, int i)
    {
        if(c[i]>0)
            return c[i];
        
        if(i==0)
        {
            c[i] = 1;
            return 1;
        }
        
        c[i] = ((N-i+1)*C(N,i-1))/i;
        return c[i] ;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int X = sc.nextInt();
        
        c = new int[X+1];
        
        
        double p = sc.nextDouble();
        double q = 1-p;
        
        double sum = 0;
        
        for(int i=0; i<=X; i++)
        {
            sum = sum + C(N,i)* Math.pow(p, i)*Math.pow(q, N-i);
        }
        
        System.out.println(sum);
        
    }
    
}
