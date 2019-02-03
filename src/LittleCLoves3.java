
import java.lang.*;
import java.io.*;
import java.util.*;

public class LittleCLoves3 
{
    
    
    public static ArrayList al;
    public static int tgl;
    public static HashSet h;
    
    public static void F(int N, int k)
    {
        if(tgl==1)
            return;
        
        if(k==2)
        {
            if(N%3!=0)
            {
                //System.out.println(al);
                al.add(N);
                h.add(al);
                tgl = 1;
            }
            return;
        }
        
        for(int i=1; i<N; i++)
        {
            if(i%3!=0)
            {
                al.add(i);
                F(N-i,k+1);
                
                if(tgl==1)
                    break;
                al.remove(al.size()-1);
            }
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        tgl = 0;
        al = new ArrayList();
        h = new HashSet();
        
        F(N,0);
        
        System.out.println(h);
        
        for(int i=0; i<al.size(); i++)  
            System.out.print(al.get(i)+" ");
    }
    
}
