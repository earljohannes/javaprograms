
package CollectionDSA;

import java.util.ArrayList;
import java.util.PriorityQueue;


public class PriorityQueueDemo
{


    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        
        for(int i=9; i>0; i--)
        {
            al.add(i);
        }
        
        System.out.println(al);
        
        PriorityQueue q = new PriorityQueue(al);
        
        
        
        System.out.println(q);
        
    }
    
}
