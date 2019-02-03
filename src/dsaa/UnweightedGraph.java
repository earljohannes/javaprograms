
package dsaa;

import java.util.ArrayList;
import java.util.LinkedList;

class GraphT2
{
    int V;
    ArrayList<LinkedList<Integer>> adjListArray;
    
    GraphT2(int nodes)
    {
        V = nodes;
        adjListArray = new ArrayList<LinkedList<Integer>>(V);
        
        for(int i = 0; i<V; i++)
        {
            adjListArray.add(new LinkedList<Integer>());
        }
    }
    
    void AddUndirectedEdge(int src, int dest)
    {
        adjListArray.get(src).add(dest);
        adjListArray.get(dest).add(src);
    }
    
    
    
}

public class UnweightedGraph 
{
    
    public static void main(String[] args) 
    {
        
    }
    
}
