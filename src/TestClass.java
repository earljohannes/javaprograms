
import java.util.*;

public class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            int[] A = new int[N];
            int sum = 0;
            int ans = 0;
            
            for(int i=0; i<N; i++)
            {
                A[i] = sc.nextInt();
                sum = sum+A[i];
            }
            
            double avg = (double) sum/N;
            
            if(Math.ceil(avg)==avg && Math.floor(avg)==avg)
            {
                int av = (int) avg;
                int ind = Arrays.binarySearch(A,av);
                
                if(ind>-1)
                    ans = A[ind];
                
                else
                    ans = -1;
            }
            
            else
            {
                ans = -1;
            }
            
            System.out.println(ans);
        }
    }
}
