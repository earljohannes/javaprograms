
package CollectionDSA;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorLL 
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
        
        ListIterator ltr = ll.listIterator();
        
        
        
        while(ltr.hasNext())
        {
            Integer i = (Integer)ltr.next();
            
        }
    }
    
}
