
package dsaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;
/**
 *
 * @author Harry
 */
public class rawTest 
{
    public static int foo(int k, String s)
    {
        if(s.length()<=1 && k<=1)
        {
            int i = Integer.parseInt(s);
            return i;
        }
        
        int sum = 0;
        
        for(int i=0; i<s.length(); i++)
        {
            String w = s.substring(i, i+1);
            int dig = Integer.parseInt(w);
            sum = sum + dig;
        }
        
        sum = sum*k;
        
        String nextpass = Integer.toString(sum);
        
        return foo(1,nextpass);
    }
    
    public static int isSorted(int[] arr, int start, int last)
    {
        
        int res = 1;
        
        for(int i=start; i<last-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                res = 0;
            }
        }
        
        return res;
    }

    
    public static void main(String[] args) 
    {
        
        int x=9;
        for(int l=x; l>=1; l--)
        {
            for(int i=0; i<=x-l; i++)
            {
                //System.out.print(i+" : "+(i+l)+"   ");
            }
            //System.out.println("");
        }
        
        int arr[] = {1,3,5,7,9,2,4,6,8};
        
        Arrays.sort(arr);
        int a = Arrays.binarySearch(arr, 0);
        System.out.println(a);
        
        
        StringBuffer sb = new StringBuffer("abcd");
        //System.out.println(sb);
        sb.insert(0, "x");
        //System.out.println(sb);
        sb.deleteCharAt(4);
        //System.out.println(sb);
        
        String st = "2 2 2 2 2 ";
        st = st.trim();
        //System.out.println("".length());
        
        
        //System.out.println(isSorted(arr,4,5));
        st = "abcdefgdhijdkildmop";
        
        
        //String[] strarr = st.split("d", st.length());
        //String[] strarr = st.split("d");
        
        //for(int i=0; i<strarr.length; i++)
        //    System.out.println(strarr[i]);
        
        int[] scores = {100,100,50,40,40,20,10};
        int[] temp = new int[scores.length+1];
        
        for(int i=0; i<temp.length; i++)
            temp[i] = -1;
        
        int j=0;
        for(int i=0; i<scores.length-1; i++)
        {
            
            if(scores[i]<scores[i+1])
            {
                //System.out.println("chala");
                temp[j] = scores[i];
                j++;
            }
        }
        
        
        
        for(int i=0; i<j; i++)
        {
            //System.out.println(temp[i]);
        }
        
        ArrayList al = new ArrayList(10);
        for(int i:scores)
            System.out.println(i);
        
        
        Stack s = new Stack();
        
        sb.toString();
        
        String s1= "";
        
        
        for(int i=0; i<10; i++)
        {
            System.out.println(i);
            if(i==5)
            {
                break;
            }
            
                
            
        }
    }

}