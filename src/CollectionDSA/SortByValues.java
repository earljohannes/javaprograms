
package CollectionDSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class CompMap implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Map.Entry<String, Integer> m1 = (Map.Entry<String, Integer>) o1;
        Map.Entry<String, Integer> m2 = (Map.Entry<String, Integer>) o2;
        
        
        return m1.getValue().compareTo(m2.getValue());
        
    }
}

public class SortByValues 
{

    public static HashMap sortByValues(HashMap h)
    {
        List< Map.Entry<String, Integer> > l = new LinkedList< Map.Entry<String, Integer> > (h.entrySet());
        
        Collections.sort(l, new CompMap());
        
        HashMap<String, Integer> nh = new LinkedHashMap<String, Integer>();
        
        for(Map.Entry<String, Integer> i:l)
            nh.put(i.getKey(), i.getValue());

        return nh;
    }
    
    public static void main(String[] args) 
    {
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        
        //  CM = 0.1
        h.put("MNCB", 66);
        h.put("SHWT", 25);
        h.put("MLK", 28);
        h.put("KJL",26);
        h.put("RVN", 50);
        h.put("TWNK", 56);
        h.put("FRH", 11000);
        h.put("SNKS", 120);
        h.put("TNSH", 62);
        h.put("SNDH", 3800);
        h.put("SHRY", 1000);
        h.put("NTMB", 24000);
        h.put("AMBR", 30000);
        h.put("KIMK", 16000);
        h.put("KHLOE", 18000);
        h.put("ANJL_NR", 11200);
        h.put("LKSH_NR", 300000);
        h.put("NH_CHD", 6000);
        h.put("MON_T", 3600);
        h.put("DMP", 9600);
        h.put("JC", 12000);
        h.put("DHAN", 10800);
        h.put("NMTH", 1800);
        h.put("SRNW", 200);
        h.put("HQ", 160);
        h.put("HEENA_T", 4800);
        h.put("PJB", 72);
        h.put("ANJ_KRND", 1600);
        h.put("WAGHMARE", 5000);
        h.put("Graciela", 36000);
        h.put("AMIRAH", 32000);

        
        h = sortByValues(h);
        
        
        ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Map.Entry<String, Integer>>(h.entrySet());
        
        for(Map.Entry<String, Integer> m : al)
            System.out.println(m.getKey()+"     "+m.getValue());
    }
    
}
