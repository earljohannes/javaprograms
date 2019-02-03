
package dsaa;


public class detect_loop_linked_list 
{
    public static int detectLoop(node head)
    {
        node arr[] = new node[301];
        node temp = head;

        int g = 0;
        int i = 0;
        while(head!=null&&i<300)
        {
            arr[i] = head;
            head = head.next;



            if(i>0)
                {
                    for(int j = 0; j<i ; j++)
                    {
                        if(arr[i]==arr[j])
                        {
                          g = 1;
                        }

                        if(g==1)
                           break;
                    }
                }

                i++;

                if(g==1)
                    break;

        }
        
        return g;
    }
    
    public static int FloydCycle(node head)
    {
        int g = 0;
        
        node temp1 = head;
        node temp2 = head;
        
        while(temp2!=null)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
            temp2 = temp2.next;
        }
                
        
        return g;
    }



    public static void main(String[] args) 
    {
        
    }
    
}
