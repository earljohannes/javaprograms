
package dsaa;



public class SinglyLinkedList 
{
    node head;
    
    SinglyLinkedList()
    {
        head = null;
    }


    void insertFromStart(int value)
    {
        node temp = new node(value);
        temp.data = value;
        temp.next = head;
        head = temp;
        
    }

//node head1 ;

//void PrintList();

/*
void insertFromStart(int value)
{
    node temp = new node();

    if(head==null)
    {
    head = temp ;
    head.data = value;
    temp = null;
    }

    if(head!=null)
    {
        temp.next = head;
        head = temp;
    }
}

void insertFromStart(int value,int kalue,)
{
    //generalized
    node temp = new node();
    temp.data = value;
    temp.next = head;
    head = temp;
}

*/
    
 

    void PrintList(node head)
    {
        while(head!=null)
        {
            
            head = head.next;
        }
    }

    void PrintList()
    {
        node temp = head;
        while(temp!=null)
        {
            System.out.println(""+temp.data);
            temp = temp.next;
        }
    }

    void insertAtPosition(node head,int position,int value)
    {
        node temp = new node(value);
        temp.data = value;
        if(position==1)
        {
            temp.next = head;
            head = temp;
            return ;
        }

        int i = 1;
        node traversor = head;
        temp.next = head;

        while(i<position-1)
        {
            traversor = traversor.next;
            i++;
        }

        temp.next = traversor.next;
        traversor.next = temp;
        
    }

    

    node deleteAtPosition(node head,int position)
    {
        if(position==1)
        {
             head = head.next;
             return head;
        }

        node temp =  head;
        node temp2 = head;

        int i = 1;
        while(i<position-1)
        {
            temp = temp.next;
            i++;
        }
        temp2 = temp.next;
        temp.next = temp2.next;
        

        return head;

    }

    node insertAtEnd(node head,int value)
    {
        node temp = new node(value);
        temp.data = value;

        node traversePointer = head;

        while((traversePointer.next)!=null)
        {
            traversePointer = traversePointer.next;
        }
        traversePointer.next = temp;
        return head;
    }
    


    public static void main(String[] args) 
    {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insertFromStart(1);
        sl.insertFromStart(2);
        sl.insertFromStart(3);
        sl.PrintList();
        
        
        
        //sl.head = reverse(head);
    }
    
}
