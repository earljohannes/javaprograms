
package dsaa;


public class reorderList 
{
    node reorderlist(node head)
    {   //reorder list
        if(head.next==null)
            return head;
        
        node temp = head.next;
        if(temp.next==null)
            return head;
        
        node middle = Middle(head);
        node nextHead = middle.next;
        middle.next = null;
        nextHead = Reverse(nextHead);
        
        node t1 = head;
        node t2 = head.next;
        
        node t3 = nextHead;
        node t4 = nextHead.next;
        
        while(t4!=null)
        {
            t1.next = t3;
            t1 = t2;
            t3.next = t2;
            t3 = t4;
            
            t2 = t2.next;
            t4 = t4.next;
        }
        
        t1.next = t3;
        
        if(t3!=null)
            t3.next = t2;
        
        return head;
    }
    
    node Middle(node head)
    {
        node temp = head;
        node temp2 = head.next;
        
        while(temp2!=null)
        {
            temp2 = temp2.next;
            if(temp2!=null)
            {
                temp = temp.next;
                temp2 = temp2.next;
            }
        }
        
        return temp;
    }
    
    node Reverse(node head)
    {
        node temp1 = head;
        
        if(head.next==null)
            return head;
        
        node temp2 = temp1.next;
        temp1.next=null;
        
        if(temp2.next==null)
        {
            temp2.next = temp1;
            return temp2;
        }
        
        node temp3 = temp2.next;
        
        while(temp2.next!=null)
        {
            temp2.next = temp1;
            temp1 = temp2;
            temp2 = temp3;
            temp3 = temp3.next;
        }
        
        temp2.next = temp1;
        
        return temp2;
    }

    public static void main(String[] args) 
    {
        
    }
    
}
