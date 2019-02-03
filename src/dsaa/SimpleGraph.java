package dsaa;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Queue;

class Graph
{
    int V;
    LinkedList adjListArray[];
    
    Graph(int v)
    {
        V = v;
        adjListArray = new LinkedList[V];
        
        for(int i=0; i<V; i++)
        {
            adjListArray[i] = new LinkedList();
        }
    }
    
    void addEdge(int child, int parent)
    {
        this.adjListArray[child].addLast(parent);
        
        this.adjListArray[parent].addLast(child);
    }
    
    void BFS(int s)
    {
        boolean[] visited = new boolean[V];
        
        Queue q = new LinkedList();
        visited[s] = true;
        
        q.add(s);
        
        while(!q.isEmpty())
        {
            s = (Integer) q.remove();
            
            ListIterator itr = adjListArray[s].listIterator();
            while(itr.hasNext())
            {
                int n = (Integer) itr.next();
                
                if(visited[n]==false)
                {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }
    
    void DFS(int v, boolean[] visited)
    {
        visited[v] = true;
        
        ListIterator itr = adjListArray[v].listIterator();
        
        while(itr.hasNext())
        {
            int n = (Integer) itr.next();
            DFS(n,visited);
        }
        
    }
    
    void Print()
    {
        for(int i=0; i<V; i++)
        {
            ListIterator itr = this.adjListArray[i].listIterator();
            System.out.print(i);
            while(itr.hasNext())
            {
                Integer k = (Integer) itr.next();
                System.out.print("-> ");
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}

public class SimpleGraph 
{
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0)
	    {
	        int V = sc.nextInt();
	        int E = sc.nextInt();

            Graph g = new Graph(V);
            
            for(int i=0; i<E; i++)
            {
                int child = sc.nextInt();
                int parent = sc.nextInt();
                
                g.addEdge(child,parent);
            }
            
            g.Print();
	    }
	}
}