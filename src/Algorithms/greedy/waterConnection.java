package src.Algorithms.greedy;

import java.util.*;

class House
{
    House next;
    House previous;
    int val;

    House(int val)
    {
        this.val = val;
        this.next = null;
        this.previous = null;
    }
}

public class waterConnection
{

    public static int endPoint(HashMap<Integer, House> h, int i)
    {
        if(h.get(i).next!=null)
            return endPoint(h, h.get(i).next.val);
        
        else
            return i;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try 
        {
            int T = sc.nextInt();

            while(T-->0)
            {
                int N = sc.nextInt();
                int P = sc.nextInt();
                HashMap<Integer, House> h = new HashMap<Integer, House>();

                int[] d = new int[P];
    
                for(int i=0; i<P; i++)
                {
                    int from = sc.nextInt();
                    int to = sc.nextInt();
                    
                    House h1, h2;
    
                    if(!h.containsKey(from))
                    {
                        h1 = new House(from);
                        h.put(from, h1);
                    }

                    else
                        h1 = h.get(from);

                    if(!h.containsKey(to))
                    {
                        h2 = new House(to);
                        h.put(to, h2);
                    }

                    else
                        h2 = h.get(to);

                    h1.next = h2;
                    h2.previous = h1;
    
                    d[i] = sc.nextInt();
                }
    
                for(int i=1; i<=N; i++)
                {
                    if(h.containsKey(i))
                    {
                        System.out.println(i+" "+endPoint(h, i));
                    }
                }
            }
        } 
        
        catch (Exception e) 
        {
            System.out.println(e);
        }

        finally
        {
            sc.close();
        }
        
    }
}
