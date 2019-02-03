
package CollectionDSA;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListInterface
{
    public static void main(String[] args)
    {
        LinkedList l = new LinkedList();
        System.out.println(l.isEmpty());
        l.add(1);
        l.add(2);
        l.addFirst(3);
        l.addLast(4);
        l.add("hi");
        l.add(2,5);
        
        

        
        System.out.println(""+l);
        
        System.out.println(""+l.getLast());
    }
    
}
