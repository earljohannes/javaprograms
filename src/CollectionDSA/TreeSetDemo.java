
package CollectionDSA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class CompT implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        int i1 = (Integer) o1;
        int i2 = (Integer) o2;

        if(i1>i2)
            return 1;

        else if(i1<i2)
            return -1;

        else
            return 0;
    }
}

public class TreeSetDemo 
{

    public static void main(String[] args) 
    {
        CompT c = new CompT();
        TreeSet t = new TreeSet(c);
        t.add(1);
        t.add(4);
        t.add(9);
        t.add(34);
        t.add(11);
        t.add(6);
        t.add(2);
        //t.add(1);
        
        System.out.println(t);
        
        
        /*
        LinkedHashSet h = new LinkedHashSet();
        ArrayList al = new ArrayList(h);
        
        al.sort(comp);
        
        Iterator itr = t.iterator();
        while(itr.hasNext())
        {
            Integer i = (Integer)itr.next();
            System.out.println(i);
        }
        */
    }
    
    
    
}
