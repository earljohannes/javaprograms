
package Algorithms;

import java.util.ArrayList;

public class PowerSet
{
    public static void powerSet(String str, int index, String curr, ArrayList al)
    {
        int n = str.length();

        // base case
        if (index == n)
            return;

        // First print current subset
        al.add(curr);
        //System.out.println(curr);

        // Try appending remaining characters to current subset
        for (int i = index + 1; i < n; i++) 
        {
            curr += str.charAt(i);
            powerSet(str, i, curr, al);
            // Once all subsets beginning with initial "curr" are printed, remove last character to consider a different prefix of subsets.
            curr = curr.substring(0,curr.length()-1);
        }
        
        return;
    }
    
    public static void powerSet2(String str, int index , String curr)
    {
        int n = str.length();

        // base case
        if (index == n)
        {
            System.out.println(curr);
            return;
        }

        // Two cases for every character (i) We consider the characteras part of current subset  (ii) We do not consider currentcharacter as part of current subset

        powerSet2(str, index+1, curr+str.charAt(index));
        powerSet2(str, index+1, curr);
    }

    public static void main(String[] args) 
    {
        String str = "abcd";
        
        ArrayList<String> al = new ArrayList<String>();
        powerSet(str, -1, "", al);
        
        System.out.println(al);
        
        //powerSet2(str, 0, "");
    }
    
}
