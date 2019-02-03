
package dsaa;

public class DeleteGreaterRight 
{
    public static node deleteGreaterAtRight(node head)
    {
        if(head.next==null)
        {
            return head;
        }
        
        node temp = head.next;
        
        while(temp!=null)
        {
            if(temp.data>head.data)
            {
                head = temp;
            }
            
            temp = temp.next;
        }
        
        if(head.next!=null)
            head.next = deleteGreaterAtRight(head.next);
        
        return head;
    }
    
    public static void compute2(SinglyLinkedList l)
    {
        l.head = deleteGreaterAtRight(l.head);
    }
    
    public static void compute(SinglyLinkedList l)
    {
        node temp = l.head;
        node temp2 = temp.next;
        int max;
        
        while(temp!=null)
        {
            if(temp==l.head)
            {
                max = temp.data;
            }    
            
            else
                max = 0;
            
            while(temp2!=null)
            {
                
                if(max<temp2.data)
                {
                    temp.next = temp2;
                    max = temp2.data;
                }
                
                temp2 = temp2.next;
            }
            
            if(temp.next!=null)
            {
                temp = temp.next;
                System.out.println(temp.data);
                temp2 = temp.next;
                //System.out.println(temp2.data);
            }
            
        }
    }

    public static void main(String[] args) 
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        
        
        sll.insertFromStart(10);
        sll.insertFromStart(2);        
        sll.insertFromStart(6);        
        sll.insertFromStart(8);        
        sll.insertFromStart(3);
        sll.insertFromStart(9);
        sll.insertFromStart(11);
        sll.insertFromStart(7);
        sll.insertFromStart(5);
        sll.insertFromStart(4);
        sll.insertFromStart(25);
        sll.insertFromStart(5);
        
        //compute(sll);
        compute2(sll);
        sll.PrintList();
        
        
    }
    
}
