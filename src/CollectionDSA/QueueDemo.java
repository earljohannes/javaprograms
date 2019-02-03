
package CollectionDSA;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo 
{
    static Queue q = new LinkedList();

    public static void main(String[] args) 
    {
        
        
        for(int i = 0; i<9; i++)
            q.add(i);
        
        q.peek();
        
        System.out.println(q);
    }
    
}
