
package dsaa;

public class MergeSortingLinkedList 
{
    public static void MergeSort(node head)
    {
        
        if(head==null)
            return;
        
        node temp = head;
        
        
    }
    
    public static node mergeSorted(node a, node b)
    {
        if(a==null)
            return b;
        
        if(b==null)
            return a;
        
        node result;
        
        if(a.data<=b.data)
        {
            result = a ;
            result.next = mergeSorted(a.next, b);
        }
        
        else
        {
            result = b;
            result.next = mergeSorted(a, b.next);
        }
        
        return result;
    }
    
    public static node middle(node head)
    {
        if(head==null)
            return head;
        
        node fastTemp = head.next;
        node slowTemp = head;
        
        while(fastTemp!=null)
        {
            
            fastTemp = fastTemp.next;
            
            if(fastTemp!=null)
            {
                slowTemp = slowTemp.next;
                fastTemp = fastTemp.next;
            }
            
        }
        
        return slowTemp;
    }
    public static void main(String[] args) 
    {
        
    }
    
}
