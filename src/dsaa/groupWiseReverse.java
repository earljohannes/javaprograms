
package dsaa;

public class groupWiseReverse 
{
    public static node ReverseGroup(node head, int k)
    {
        node temp = head;
        int i = 1;
        while(i<k&&temp!=null)
        {
            temp = temp.next;
            i++;
        }
        
        if(temp==null)
            return head;
        
        
        
        
        System.out.println("Reached here");
        node prev = ReverseGroup(temp.next, k);
        node tail = reverseChunk(head, k);
        head.next = prev;
        return tail;
        
            
        
    }
    
    public static node reverseChunk(node head, int k)
    {
        
        node temp1 = head;
        
        if(temp1.next==null)
            return head;
        
        node temp2 = temp1.next;
        temp1.next = null;
        
        if(temp2.next==null)
        {
            temp2.next = temp1;
            return temp2;
            
        }
        
        int i = 1;
        
        node temp3 = temp2.next;
        while(i<k-1)
        {
            temp2.next = temp1;
            temp1 = temp2;
            temp2 = temp3;
            temp3 = temp3.next;
            i++;
        }
        
        temp2.next = temp1;
        
        
        return temp2;
    }

    public static void main(String[] args) 
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        
        for(int i=12; i>0; i--)
            sll.insertFromStart(i);
        
        sll.head = ReverseGroup(sll.head,3);
        //sll.head = reverseChunk(sll.head,2);
        sll.PrintList();
        
    }
    
}
