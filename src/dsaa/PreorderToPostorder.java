
package dsaa;

public class PreorderToPostorder 
{


public static int search(int arr[], int x, int m, int n)
{
    int k = 0;
    for (int i = m; i <= n; i++)
    {
	if (arr[i] == x)
        {
		return k;
        }
        k++;
    }
    
    return -1;
}


public static void printPostOrder(int in[], int pre[], int InStart, int InLast, int preStart, int preLast)
{
    
    System.out.println("InStart : "+InStart);
    System.out.println("InLast : "+InLast);
    System.out.println("preStart : "+preStart);
    System.out.println("preLast : "+preLast);
    
    int rootIndex = search(in, pre[preStart], InStart, InLast);
    System.out.println("root : "+rootIndex);

    if(rootIndex != 0)
            printPostOrder(in, pre, InStart, rootIndex-1, preStart+1, preLast);


    if(rootIndex != InLast)
            printPostOrder(in, pre, InStart+rootIndex+1, in.length-rootIndex, preStart+rootIndex+1, preLast);

    System.out.println("DATA : "+pre[preStart]);

}



    
    public static void main(String[] args) 
    {
        int pre[] = {1, 2, 4, 5, 3, 6};
        int in[] = {4, 2, 5, 1, 3, 6};
        int n = in.length;
        int start = 0;

        printPostOrder(in, pre, start, n-1, start, n-1);

    }
    
}
