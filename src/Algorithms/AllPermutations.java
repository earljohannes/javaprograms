
package Algorithms;


public class AllPermutations
{
    private static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        
        
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                
                //backtracking
                str = swap(str,l,i);
            }
        }
    }

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args)
    {
        permute("abc", 0, "abc".length()-1);
        
    }

}
