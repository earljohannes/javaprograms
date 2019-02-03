
package dsaa;

public class QueueUsingLL 
{
    Node front;
    Node rear;
    DoublyLinkedList dll;
    int size;
    
    QueueUsingLL()
    {
        front = null;
        rear = null;
        size = 0;
        dll = new DoublyLinkedList();
    }
    
    void Enqueue(Object o)
    {
        dll.InsertAtBeginning(o);
        front = dll.head;
        rear = dll.tail;
        size++;
    }
    
    Object Dequeue()
    {
        if(size==0)
        {
            return null;
        }
        
        Object o = dll.tail.data;
        dll.DeleteLast();
        size--;
        
        return o;
    }
    
    void Print()
    {
        dll.PrintBack();
    }
    

    public static void main(String[] args) 
    {
        QueueUsingLL q = new QueueUsingLL();
        q.Enqueue(1);
        q.Enqueue(2.0);
        q.Enqueue(3.00);
        q.Enqueue('4');
        q.Enqueue("5");
        
        q.Print();
        System.out.println("=================================");
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        
        System.out.println("=================================");
        q.Print();
    }
    
}
