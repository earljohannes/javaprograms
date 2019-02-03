
package Algorithms;

import java.util.Scanner;

public class WordBreak 
{
    public static String[] D;
    
    public static boolean isPresent(String word)
    {
        boolean ans = false;
        
        for(int i=0; i<D.length; i++)
        {
            if(D[i].equals(word))
                ans = true;
                
            if(ans==true)
                break;
        }
        
        return ans;
    }
    
    public static boolean is(String word)
    {
        boolean ans = false;
        
        if(isPresent(word))
            return true;
        
        
        else
        {
            int k = 1;
            while(k<word.length())
            {
                int chala = 0;
                
                if( isPresent(word.substring(0,k)) )
                {
                    chala = 1;
                    StringBuffer t = new StringBuffer(word);
                    t.delete(0,k);
                    word = new String(t);
                    //System.out.println(word);
                    ans = true && is(word);
                }
                
                else
                {
                    k++;
                }
                
                if(chala==1)
                    break;
            }
        }
        
        return ans;
    }
    
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0)
		{
		    int N = sc.nextInt();
		    D = new String[N];
		    
		    for(int i=0; i<N; i++)
		        D[i] = sc.next();
		    
		    String word = sc.next();
		    
		    if(is(word))
		        System.out.println("1");
		        
		    else
		        System.out.println("0");
		    
		        
		  
		}
	}
}