package dsaa;

import static dsaa.Recursive_Reverse_LL.reverse;

public class AddTwoNumbersRepresentedByLL 
{
    node addTwoLists(node first, node second)
	{
	    node temp1 = first;
	    node temp2 = second;
	    SinglyLinkedList all = new SinglyLinkedList();
	    
	    
	    int carry = 0;
	    int sum,x,y,rem;
	    while(temp1!=null||temp2!=null)
	    {
	        if(temp1==null)
	            x = 0;
	            
	        else
	            x = temp1.data;
	            
	        if(temp2==null)
	            y = 0;
	            
	        else
	            y = temp2.data;
	            
	        sum = x + y + carry;
	        rem = sum%10;
	        all.insertFromStart(rem);
	        carry = sum/10;
	        
	        if(temp1!=null)
	            temp1 = temp1.next;
	       
	        if(temp2!=null)
	        temp2 = temp2.next;
	        
	    }
	    
	    if(carry>0)
	        all.insertFromStart(carry);
	    
	    all.head = reverse(all.head);
	    return all.head;
	}


    public static void main(String[] args) 
    {
        // TODO code application logic here
    }
    
}
