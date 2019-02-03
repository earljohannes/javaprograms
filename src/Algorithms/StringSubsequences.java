
package Algorithms;

public class StringSubsequences 
{
    public static void printSubSeqRec(String str, int n, int index, String curr)
{
    // base case
    if (index == n) 
        return;
  
    System.out.println(curr);
    for (int i = index + 1; i < n; i++) 
    {
  
        curr += str.charAt(i);
        printSubSeqRec(str, n, i, curr);
   
        // backtracking
        curr = curr.substring(0,curr.length()-1);
        //StringBuffer sb = new StringBuffer(curr);
        //sb.deleteCharAt(curr.length()-1);
        //curr = sb.toString();
    }
    
}


    public static void main(String[] args) 
    {
        String str = "abcd";
        printSubSeqRec(str, str.length(), -1, "");
    }
    
}
