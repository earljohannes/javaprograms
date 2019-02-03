
package Algorithms;

public class DP_Fibonacci 
{
    public static int FibMemo[];
    
    

    public static int Fibonacci(int n)
    {
        if(n==1)
            return 1;
        
        else if(n==2)
            return 1;
        
        else
            return Fibonacci(n-1) + Fibonacci(n-2);
    }
    
    public static int Fibonacci_TD(int n)
    {
        if(FibMemo[n]>0)
            return FibMemo[n];
        
        if(n==1)
        {
            FibMemo[1] = 1;
            return 1;
        }
        
        else if(n==2)
        {
            FibMemo[2] = 1;
            return 1;
        }
        
        else
        {
            int k = Fibonacci_TD(n-1) + Fibonacci_TD(n-2);
            FibMemo[n] = k;
            return k;
        }
        
    }
    
    public static int Fibonacci_BU(int n, int[] Fib)
    {
        int f;
        for(int i=1; i<=n; i++)
        {
            if(i<=2)
                f = 1;
            
            else
                f = Fib[i-1] + Fib[i-2];
            
            Fib[i] = f;
        }
        
        return Fib[n];
        
    }
    
    public static void main(String[] args) 
    {
        FibMemo = new int[100];
        for(int i=0; i<100; i++)
            FibMemo[i] = 0;
        
        int[] arr = new int[100];
        
        
        int a = Fibonacci_TD(46);
        System.out.println(a);
        
        int b = Fibonacci_BU(45, arr);
        System.out.println(b);
    }
    
}
