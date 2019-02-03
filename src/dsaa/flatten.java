package dsaa;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;


public class flatten
{
    /*
    ArrayList<Integer> al = new ArrayList<Integer>();
    public  void insert(node root)
    {
        node temp = root;
        
        while(temp!=null)
        {
            al.add(temp.data);
            temp = temp.bottom;
        }
        
        if(root.next!=null)
            insert(root.next);
        
    }
    
    public node flatten(node root)
    {
        MyComp comp = new MyComp();
        insert(root);
        al.sort(comp);
        //System.out.println(al);
        
        Iterator itr = al.iterator();
        
        node temp = root;
        while(itr.hasNext())
        {
            Integer i = (Integer)itr.next();
            temp.data = i;
            
            if(temp.bottom==null&&itr.hasNext())
            {
                node newnode = new node(0);
                temp.bottom = newnode;
            }
            
            temp = temp.bottom;
        }
        
        return root;
        
    }
    */
    
    public static void main(String args[])
    {
        
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