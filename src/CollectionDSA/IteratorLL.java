
package CollectionDSA;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;


public class IteratorLL 
{

    public static void main(String[] args) 
    {
        LinkedList ll = new LinkedList();
        for(int i = 5; i>0 ; i--)
        {
            ll.addFirst(i);
        }
        
        for(int i = 6 ; i<11 ; i++)
        {
            ll.addLast(i);
        }
        
        System.out.println(""+ll);
        System.out.println(""+ll.size());
        
        Iterator itr = ll.iterator();
        
        while(itr.hasNext())
        {
            Integer i = (Integer)itr.next();
            if(i%2==0)
            {
                itr.remove();
            }
        }
        
        System.out.println(""+ll);
        System.out.println(""+ll.size());
        
        ll.remove(0);
        ll.remove();
        
        System.out.println(""+ll);
        System.out.println(""+ll.size());
        
    }
    
}
