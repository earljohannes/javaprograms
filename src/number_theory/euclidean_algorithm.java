
package number_theory;

import java.util.Scanner;


public class euclidean_algorithm 
{
    
    public static int GCD(int a, int b)
    {
        if(a%b==0)
            return b;
        
        else
            return GCD(b,a%b);
    }
    
    public static int GCD2(int a, int b)
    {
        int r = a%b;
        int q = a/b;
        
        if(r==0)
            return b;
        
        else
            return GCD(b,r);
    }


    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println("" + GCD2(x,y));
    }
    
}
