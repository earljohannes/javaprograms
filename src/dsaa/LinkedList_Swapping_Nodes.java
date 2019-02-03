
package dsaa;

import java.util.Scanner;


public class LinkedList_Swapping_Nodes 
{
    
    
    public static Node NodeSwap(int a, int b, Node head)
    {
        Node t1 = head,t2,t3 ,t4 = head,t5,t6;
        
        int i = 1,j = 1;
        while(i<a-1)
        {
            t1 = t1.next;
            i++;
        }
        
        t2 = t1.next;
        t3 = t2.next;
        
        while(j<b-1)
        {
            t4 = t4.next;
            j++;
        }
        
        t5 = t4.next;
        t6 = t5.next;
        
        t1.next = t5;
        t5.previous = t1;
        
        t2.next = t6;
        t6.previous = t2;
        
        t4.next = t2;
        t2.previous = t4;
        
        t5.next = t3;
        t3.previous = t5;
        
        return head;
        
    }
    
    

    public static void main(String[] args) 
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        
        for(int i = 9 ; i>0 ; i--)
        {
            dll.InsertAtBeginning(i);
        }
        
        //System.out.println("Enter the nodes position to be swapped");
        
        Scanner sc = new Scanner(System.in);
        //int x = sc.nextInt();
        //int y = sc.nextInt();
        
        dll.head = NodeSwap(3,7,dll.head);
        dll.Print();
        
        
        
    }
    
}
