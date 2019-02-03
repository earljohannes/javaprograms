
package dsaa;


public class Recursive_Reverse_LL 
{
    public static node reverse(node head)
    {
        node temp = head;
        head = reverse_recursive(head);
        temp.next = null;
        return head;
    }
    
    public static node reverse_recursive(node head)
    {
        node t1 = head;
        node t2 = head.next;
        node prev = null;
        
        if(t2.next==null)
        {
            prev = t2;
            //t2.next = t1;
            //System.out.println(bulla.data);
            //return prev;
        }
         
        else
        {
            prev = reverse_recursive(t2);
            //t2.next = t1;
            //System.out.println(t2.data);
        }
        
        t2.next = t1;
        return prev;
    }

    public static void main(String[] args) 
    {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFromStart(2);
        sll.insertFromStart(4);
        //sll.insertFromStart(6);
        //sll.insertFromStart(8);
        //sll.insertFromStart(10);
        //sll.insertFromStart(12);
        sll.PrintList();
        
        
        sll.head = reverse(sll.head);
        //System.out.println(sll.head.data);
        sll.PrintList();
        
    }
    
}
