
import java.lang.*;
import java.io.*;
import java.util.*;

public class CoverPoints 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        int k=1;
        
        for(int i=0; i<N; i++)
        {
            X[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }
        
        for(int i=0; i<N; i++)
        {
            int s = X[i]+Y[i];
            double f =  s/(k*1.0);
            
            if(f>1.0)
                k = X[i]+Y[i];
       }
       
        System.out.println(k);
        
    }
    
}
