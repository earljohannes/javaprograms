
package CollectionDSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

class MapGraph
{
    int V;
    HashMap<Integer, LinkedList<Integer>> adjListArray ;
    
    MapGraph(int nodes)
    {
        V = nodes;
        adjListArray = new HashMap<Integer, LinkedList<Integer>>();
        
        for(int i=0; i<V; i++)
        {
            adjListArray.put(i, new LinkedList<Integer>());
        }
        
        
    }
    
    MapGraph(int[] arr)
    {
        V = arr.length;
        adjListArray = new HashMap<Integer, LinkedList<Integer>>();
        
        for(int i=0; i<V; i++)
        {
            adjListArray.put(arr[i], new LinkedList<Integer>());
        }
        
        
    }
    
    MapGraph(HashSet<Integer> h)
    {
        V = h.size();
        Iterator itr = h.iterator();
        adjListArray = new HashMap<Integer, LinkedList<Integer>>();
        
        for(int i=0; itr.hasNext(); i++)
        {
            adjListArray.put((Integer)itr.next(), new LinkedList<Integer>());
        }
        
        
    }
    
    
    
    void addEdge(int src, int dest)
    {
        if(src>adjListArray.size() || dest> adjListArray.size())
        {
            return;
        }
        
        LinkedList<Integer> sl = adjListArray.get(src);
        sl.add(dest);
        
        LinkedList<Integer> dl = adjListArray.get(dest);
        dl.add(src);
    }
}

public class UnweightedGraph2 
{

    public static void main(String[] args) 
    {
        
    }
    
}
