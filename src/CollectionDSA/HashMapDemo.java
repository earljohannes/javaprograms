
package CollectionDSA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapDemo 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>(); 
        h.put(4, 500);
        h.put(5, 900);
        h.put(6, 750);
        h.put(10, 1200);
        
        Set s = h.keySet();
        Set es = h.entrySet();
        
        System.out.println(s);
        System.out.println(es);
        
        HashSet<Integer> h2 = new HashSet<Integer>();
        
        
        
        h.size();
    }
    
}
