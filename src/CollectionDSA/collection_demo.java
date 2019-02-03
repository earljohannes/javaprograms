
package CollectionDSA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;


public class collection_demo 
{
    
    
    public static void main(String[] args)
    {
        int a = 10;
        char b = 'c';
        ArrayList al = new ArrayList(20);
        al.add("abc");
        al.add("a bc");
        al.add("ab c");
        al.add("ab cd");
        al.add("a bcd");
        al.add("abc d");
        
        System.out.println(al);
        MyComp comp = new MyComp();
        al.sort(new Comp());
        System.out.println(al);
        
        System.out.println(al.size());
        
        ArrayList al2 = new ArrayList();
        al2.add(1);
        al2.add('d');
        al2.add("name");
        Vector v = new Vector();
        
        
        al.addAll(al2);
        System.out.println(al.size());
    }
}

class MyComp implements Comparator
{
    public int compare(Object t1, Object t2)
    {
        
        Integer i1 = (Integer)t1;
        Integer i2 = (Integer)t2;
        
        if(i1<i2)
            return -1;
        
        else if(i2>i1)
            return 1;
        
        else
            return 0;
        
    }


}

class Comp implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        String s1 = (String) o1;
        String s2 = (String) o2;
        
        return s1.compareTo(s2);
    }
}


