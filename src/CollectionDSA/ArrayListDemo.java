
package CollectionDSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;



class Compa implements Comparator
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

public class ArrayListDemo
{

    public static ArrayList<String> al;
    
    public static void main(String[] args) 
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        for(int i=0; i<10; i++)
        {
            al.add(i+1);
        }
        
        
        for(int i=al.size()-1; i>=0; i--)
        {
            System.out.println(al.get(i)+"  Size : "+al.size());
            al.remove(i);
        }

        Collections.sort(al);
        
        Compa c = new Compa();
        Collections.binarySearch(al, 4);
        int[] a = {2,4,7,0,21};
        
        Object o1;
        Double dq;
        
        String s1 ="";
        String s2 ="";
        
        Integer i = 9;
        Integer j = 8;
        
        i.compareTo(j);
        
        ListIterator it = al.listIterator();
        
        while(it.hasNext())
        {
            
        }
        
        
        //System.out.println(a);
        //System.out.println(Arrays.toString(a));

    }
    
}
