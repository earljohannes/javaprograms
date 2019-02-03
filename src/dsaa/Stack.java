
package dsaa;

import java.util.Arrays;


public class Stack 
{
    int top;
    int Size;
    Object[] array;
    int capacity;
    
    Stack(int capacity)
    {
        this.capacity = capacity;
        top = -1;
        Size = 0;
        array = new Object[capacity];
    }
    
    void Push(Object data)
    {
        if(this.Size==this.capacity)
        {
            System.out.println("Stack full");
            return;
        }
        
        array[++top] = data;
        Size++;
        
    }
    
    Object Pull()
    {
        if(top==-1)
        {
            System.out.println("Stack empty");
        }
        
        Object e = array[top--];
        //top--;
        Size--;
        return e;
    }
    


    public static void main(String[] args) 
    {
        Stack s = new Stack(10);
        s.Push(10);
        s.Push(2.22);
        s.Push('c');
        s.Push("harsh");
        System.out.println(""+s.Size);
        System.out.println(""+s.capacity);
        System.out.println(""+s.Pull());
    }
    
}
