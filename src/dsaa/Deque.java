
package dsaa;

public class Deque extends Queue
{
    Deque(int capacity)
    {
        
        super(capacity);
        //System.out.println("sub");
    }
    
    void EnqueueAtFront(Object data)
    {
        if(size==capacity-1)
        {
            System.out.println("Queue Full");
        }
        
        front = (front-1)%capacity;
        array[front] = data;
        size++;
    }
    
    Object DequeueAtRear()
    {
        if(size==0)
        {
            System.out.println("Queue empty");
            return null;
        }
        
        Object o = array[rear];
        rear = (rear-1)%capacity;
        size--;
        
        return o;
    }


    public static void main(String[] args) 
    {
        Deque q = new Deque(6);
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        
        q.Print();
        System.out.println("=================================");
        System.out.println(q.Dequeue());
        System.out.println(q.Dequeue());
        System.out.println(q.DequeueAtRear());
        System.out.println(q.DequeueAtRear());
        System.out.println("=================================");
        q.Print();
        
        
    }
    
}
