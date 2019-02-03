
package dsaa;
import java.util.Arrays;

class HeapNode
{
    int data;
    HeapNode left;
    HeapNode right;
    
    HeapNode(int value)
    {
        data = value;
        left = right = null;
    }
    
}




public class MaxHeap 
{
    int Size;
    int capacity;
    int array[] ;
    Queue q;
    
    
    MaxHeap(int capacity)
    {
        this.capacity = capacity;
        Size = 0;
        array = new int[capacity];
    }
    
    public void MaxHeapify()
    {
        if(this.Size < 2)
            return;
        
        int indChild = this.Size-1;
        int indParent = ((indChild-1)/2); 
        
        while(array[indParent] < array[indChild])
        {
            int temp = array[indParent];
            array[indParent] = array[indChild];
            array[indChild] = temp;
            
            
            indChild = indParent;
            
            if(indChild>=1)
                indParent = ((indChild-1)/2); 

        }
        
        
    }
    
    public void HeapInsert(int data)
    {
        if(this.Size < this.capacity)
        {
            array[Size] = data;
            Size++;
            this.MaxHeapify();
        }
    }
    
    public void Print()
    {
        for(int i=0; i < this.Size; i++)
        {
            System.out.print(this.array[i]+" ");
        }
    }
    
    public static void HeapifyNode(int array[], int n, int i)
    {
        int l = 2*i+1;
        int r = 2*i+2;
        int Size = array.length;
        
        int largest = i;
        
        if(l<n && array[largest]<array[l])
            largest = l;
        
        if(r<n && array[largest]<array[r])
            largest = r;
        
        if(largest != i)
        {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            
            HeapifyNode(array, n, largest);
        }
    }

    
    public static void BuildMaxHeap(int array[])
    {        
        int n = array.length;     //last index
        
        for(int i = (n-1)/2; i>=0; i--)
        {
            HeapifyNode(array, n, i);
        }
        
        //return array;
    }
    
    public static void HeapSort(int array[])
    {
        int n = array.length;
        
        BuildMaxHeap(array);
        
        int maxElement = array[0];
        
        for(int i=n-1; i>=0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            
            HeapifyNode(array,i,0);
        }
    }
     


    public static void main(String[] args) 
    {
        MaxHeap mhp = new MaxHeap(10);
        
        mhp.HeapInsert(4);
        mhp.HeapInsert(9);
        mhp.HeapInsert(8);
        mhp.HeapInsert(1);
        mhp.HeapInsert(2);
        mhp.HeapInsert(5);
        mhp.HeapInsert(6);
        mhp.HeapInsert(11);
        mhp.Print();
        System.out.println("");
        
        int arr[] = {3,5,2,7,4,9,1,10};
        
        BuildMaxHeap(arr);
        
        //HeapSort(arr);
        
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        
        
    }
    
}
