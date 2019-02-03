
package dsaa;


public class Queue 
{
    int front;
    int rear;
    int capacity;
    int size;
    Object[] array;
    
    
    Queue(int capacity)
    {
        //System.out.println("super");
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
        array = new Object[capacity];
    }
    
    void Enqueue(Object data)
    {
        int c = (rear+1)%capacity;
        
        if(isFull())
        {
            System.out.println("Queue full");
            return;
        }
        
        rear = (rear+1)%capacity;
        array[rear] = data;
        size++;
        
    }
    
    Object Dequeue()
    {
        Object e = array[front];
        front = (front+1)%capacity;
        size--;
        return e;
    }
    
    void Print()
    {
        if(isEmpty())
        {
            System.out.println("Queue Empty");
            return;
        }
        
        if(rear==capacity-1)
        {
            for(int i=front ; i<=rear ; i++)
            {
                System.out.println(""+array[i]);
            }
            return;
        }

        for(int i = front ; i!=rear+1 ; i=(i+1)%capacity)
        {
            System.out.println(""+array[i]);
        }
        
    }
    
    boolean isFull()
    {
        return (size==capacity);
    }
    
    boolean isEmpty()
    {
        return (size==0);
    }
    
    public static void main(String[] args) 
    {
        Queue q = new Queue(10);
        for(int i=0 ; i<9 ; i++)
        {
            q.Enqueue(i);
        }
        
        System.out.println(""+q.front);
        System.out.println(""+q.rear);
        System.out.println(""+q.size);
        
        System.out.println("=================================");
        
        for(int i=0 ; i<5 ; i++)
        {
            System.out.println(""+q.Dequeue());
        }
        
        System.out.println("=================================");
        
        q.Enqueue(9);
        q.Enqueue(10);
        q.Enqueue(11);
        q.Enqueue(12);
        q.Enqueue("13");
        //q.Enqueue('d');
        
        q.Print();
        System.out.println("=================================");
        
        System.out.println(""+q.front);
        System.out.println(""+q.rear);
        System.out.println(""+q.size);
        
    }
    
}
