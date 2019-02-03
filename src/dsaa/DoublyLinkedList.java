
package dsaa;

class Node
{
    Object data;
    Node next;
    Node previous;
    
    Node(Object value)
    {
        data = value;
        next = null;
        previous = null;
    }
}

public class DoublyLinkedList 
{
    Node head;
    Node tail;
    
    DoublyLinkedList()
    {
        head = null;
        tail = null;
    }
    
    void InsertAtBeginning(Object value)
    {
        Node newNode = new Node(value);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            return;
        }
        
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    
    }
    
    void InsertAt(int position, Object value)
    {
        Node newNode = new Node(value);
        if(position==1)
        {
            this.InsertAtBeginning(value);
            return;
        }
        
        int i = 1;
        Node traversePointer1 = head;
        Node traversePointer2 = head;
        
        while(i<position-1)
        {
            traversePointer1 = traversePointer1.next;
            i++;
        }
        
        traversePointer2 = traversePointer1.next;
        
        newNode.previous = traversePointer1;
        newNode.next = traversePointer2;
        traversePointer1.next = newNode;
        traversePointer2.previous = newNode;
        
    }
    
    void InsertAtEnd(Object value)
    {
        Node newNode = new Node(value);
        if(tail==null)
        {
            tail = newNode;
            head = newNode;
            return;
        }
        
        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
    }
    
    void DeleteFirst()
    {
        Node temp = head;
        if(head==null)
        {
            System.out.println("Empty list");
            return;
        }
        
        head = temp.next;
        temp.next = null;
        head.previous = null;
        
    }
    
    void DeleteLast()
    {
        Node temp = tail;
        if(tail==null)
        {
            System.out.println("Empty list");
            return;
        }
        
        tail = temp.previous;
        temp.previous = null;
        tail.next = null;
    }
    
    void Delete(int position)
    {
        if(position==1)
        {
            DeleteFirst();
            return;
        }
        
        Node temp =  head;
        Node temp2;
        Node temp3;
        
        int i =1;
        
        while(i<position-1)
        {
            temp = temp.next;
            i++;
        }
        
        temp2 = temp.next;
        temp3 = temp2.next;
        
        temp.next = temp2.next;
        temp3.previous = temp2.previous;
        temp2.next = null;
        temp2.previous = null;
        
        
    }
    
    void Print()
    {
        Node traversePointer = head;
        while(traversePointer!=null)
        {
            System.out.println(traversePointer.data+"");
            traversePointer = traversePointer.next;
        }
    }
    
    void PrintBack()
    {
        Node traversePointer = tail;
        while(traversePointer!=null)
        {
            System.out.println(""+traversePointer.data);
            traversePointer = traversePointer.previous;
        }
    }
    
    void InsertAtMiddle(Object data)
    {
        Node temp = head.next;
        Node temp2 = head;
        Node temp3;
        Node newNode = new Node(data);
        
        int i =1;
        while(temp.next!=null)
        {

            
            if(i%2!=0)
            {
                temp2 = temp2.next;
                System.out.println("1");
            }
            
            temp = temp.next;
            System.out.println("2");
            i++;
        }
        
        temp3 = temp2.next;
        
        newNode.next = temp3;
        newNode.previous = temp2;
        temp2.next = newNode;
        temp3.previous = newNode;
    }

    public static void main(String[] args) 
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.InsertAtBeginning(4.4);
        dll.InsertAtBeginning(3.33);
        dll.InsertAtBeginning(2.000);
        dll.InsertAtBeginning(1);
        dll.InsertAtEnd('6');
        dll.InsertAtEnd("7.000");
        dll.InsertAtEnd(8);
        dll.InsertAt(5, 5);
        dll.Print();
        System.out.println("=================================");
        //dll.DeleteFirst();
        //dll.DeleteFirst();
        //dll.DeleteLast();
        //dll.DeleteLast();
        dll.Delete(5);
        dll.Delete(5);
        dll.Print();
        System.out.println("=================================");
        dll.InsertAtEnd("end");
        dll.InsertAtMiddle("middle");
        dll.Print();
        
        //dll.PrintBack();
    }
    
}
