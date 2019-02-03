
package dsaa;

import java.util.HashSet;


public class removeDuplicates 
{
    node removeDuplicatesUnsorted(node head)
    {
        HashSet h = new HashSet(51);
        node temp = head;
        node temp2 = head.next;
        boolean c;
        
        h.add(temp.data);
        
        while(temp2!=null)
        {
            c = h.add(temp2.data);
            
            if(c==false)
            {
                temp.next = temp2.next;
                temp2.next = null;
                temp2 = temp.next;
                continue;
            }
            
            temp = temp.next;
            temp2 = temp2.next;
        }
        
        temp = head;
        temp2 = head.next;
        
        return head;
    }

    node removeDuplicates(node head)
    {
        node temp1 = head;
        node temp2 = head.next;
        
        while(temp2!=null)
        {
            if(temp2.data==temp1.data)
            {
                temp1.next = temp2.next;
                temp2 = temp2.next;
                continue;
            }
            
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return head;
    }
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
    }
    
}
