/*
For a given string S, comprising of only lowercase English alphabets,
eliminate the vowels from the string that occur between two 
consonants(sandwiched between two immediately adjacent consonants).
 */
package Algorithms;


import java.util.*;
import java.lang.*;
import java.io.*;

public class SandwichVowels 
{
    public static StringBuffer sb;
    
    public static boolean isVowel(String s, int i)
    {
        String temp = s.substring(i,i+1);
        int ind = sb.indexOf(temp);
        
        if(ind==-1)
            return false;
        
        else
            return true;
        
    }
    
	public static void main (String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while(T-->0)
        {
            String s = sc.next();
            sb = new StringBuffer("aeiou");
            StringBuffer ans = new StringBuffer(s.substring(0,1));
            
            for(int i=1; i<s.length()-1; i++)
            {
                if(isVowel(s,i) && !isVowel(s,i+1) && !isVowel(s,i-1))
                ;
                
                else
                    ans.append(s.charAt(i));
            }
            ans.append(s.charAt(s.length()-1));
            System.out.println(ans);
        }
        
	}
}