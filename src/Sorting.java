
public class Sorting 
{
    public static int[] BubbleSort(int[] arr)
    {
        int N = arr.length;
        
        for(int pass=1; pass<N; pass++)
        {
            for(int i=0; i<N-pass; i++)
            {
                if(arr[i]>arr[i+1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                
                for(int k:arr)
                    System.out.print(k+" ");
            
                System.out.println("");
                
            }
            
            
            
        }
        
        
        return arr;
    }
    
    public static int[] SelectionSort(int[] arr)
    {
        int N = arr.length;
        
        for(int i=0; i<N; i++)
        {
            int minInd = min(arr,i);
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
            
            for(int k:arr)
                System.out.print(k+" ");
            
            System.out.println("");
            
        }
        
        return arr;
    }
    
    public static int[] InsertionSort(int[] arr)
    {
        int N = arr.length;
        
        for(int i=1; i<N; i++)
        {
            int temp = arr[i];
            
            int j = i-1;
            while(j>=0 && temp<arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        
        return arr;
    }

    public static void main(String[] args) 
    {
        int[] arr = {10,9,8,7,6,5};
        arr = SelectionSort(arr);
        
        //for(int i=0; i<arr.length; i++)
            //System.out.print(arr[i]+" ");
    }
    
    public static int min(int arr[], int i)
    {
        int min = Integer.MAX_VALUE;
        int mindex = 0;
        int N = arr.length;
        
        for(int j=i; j<N; j++)
        {
            if(min>arr[j])
            {
                min = arr[j];
                mindex = j;
            }
        }
        
        String s = "";
        String s2 = "";
        
        return mindex;
    }
    
}
