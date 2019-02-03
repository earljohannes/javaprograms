
import java.util.Scanner;




public class Coins 
{
    
    public static int dpt;
    
    public static int MIN(int N, int S)
    {
        dpt = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=1; i<=N; i++)
        {
            calcMin(i,S,N,0);
            
            if(dpt<min)
                min = dpt;
            
        }
        return 0;
    }
    
    public static void calcMin(int i, int S, int N, int sum)
    {
        dpt++;
        
        if(sum==S)
            return;
        
        for(int k=i+1; i<=N; k++)
        {
            if(sum+k<S)
                calcMin(k, S, N, sum+k);
        }
        
        
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        
        dpt = 0;
        
        System.out.println(MIN(N,S));
        
    }
    
}
