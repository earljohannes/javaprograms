
package dsaa;


public class StackUsingLL 
{
    Node top;
    int size;
    int capacity;
    DoublyLinkedList dll;
    
    StackUsingLL(int capacity)
    {
        dll = new DoublyLinkedList();
        size = 0;
        top = dll.head;
        this.capacity = capacity;
    }
    
    void Push(Object o)
    {
        dll.InsertAtBeginning(o);
        size++;
        top = dll.head;
    }
    
    Object Pull()
    {
        if(dll.head==null)
        {
            return null;
        }
        Object e = dll.head.data;
        dll.DeleteFirst();
        top = dll.head;
        size--;
        return e;
    }
    
    void Print()
    {
        dll.Print();
    }

    public static void main(String[] args) 
    {
        StackUsingLL sll = new StackUsingLL(5);
        sll.Push(2);
        sll.Push("4");
        sll.Push('6');
        sll.Push(8.00);
        
        System.out.println(""+sll.Pull());
        System.out.println(""+sll.Pull());
        System.out.println("=================================");
        sll.Print();
    }
    
}
