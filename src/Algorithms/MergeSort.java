
package Algorithms;


public class MergeSort 
{

    public static void mergeSorted(int[] A, int l, int m, int r)
    {
        int l1 = m-l;
        int l2 = r-m;
        
        int[] M1 = new int[l1];
        int[] M2 = new int[l2];
        
        int j=0, k=0, ind = l;
        
        for(int i=0; i<l1; i++)
            M1[i] = A[l+i];
        
        for(int i=0; i<l2; i++)
            M2[i] = A[m+i];
        
        while(j<l1 && k<l2)
        {
            if(M1[j]<M2[k])
            {
                A[ind] = M1[j];
                j++;
            }
            
            else
            {
                A[ind] = M2[k];
                k++;
            }
            ind++;
        }
        
        while (j < l1) 
        { 
            A[ind] = M1[j]; 
            j++; 
            ind++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (k < l2) 
        { 
            A[ind] = M2[k]; 
            k++; 
            ind++; 
        } 
    }
    
    public static void mergeSort(int[] A, int l, int r)
    {
        /*
        for(int k = l; k<r; k++)
            System.out.print(A[k]+" ");
        
        System.out.println("");
        */
        
        if(l==r-1)
            return;
        
        int m = (l+r)/2;
        
        mergeSort(A, l, m);
        mergeSort(A, m, r);
        
        mergeSorted(A, l, m, r);
    }
    
    public static void main(String[] args) 
    {
        int[] A = {2,4,8,9,1,7,6,5,91};
        int N = A.length;
        
        mergeSort(A, 0, N);
        
        for(int i:A)
            System.out.print(i+" ");
    }
    
}
