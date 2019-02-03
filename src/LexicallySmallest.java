
import java.util.*;


public class LexicallySmallest 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        String s = sc.next();
        
        int i=0, j=1;
        
        while(j<N)
        {

            if(s.substring(i, i+1).compareTo(s.substring(j, j+1))<0)
            {
                i = j;
            }
            
            j++;
            
        }
        
        StringBuffer sb = new StringBuffer(s);
        sb.deleteCharAt(i);
        
        System.out.println(sb.toString());
        
        
    }
    
}
