/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Scanner;

/**
 *
 * @author Harry
 */
public class PermutationSpaces 
{
    public static void spacify(StringBuffer s, int i)
    {
        if(s.length()==i)
        {
            System.out.print("("+s+")");
            return;
        }
        
        
        s.insert(i," ");
        spacify(s,i+2);
        
        s.deleteCharAt(i);
        spacify(s,i+1);
        
        
    }
    
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0)
	    {
	        String s = sc.next();
	        StringBuffer sb = new StringBuffer(s);
	        spacify(sb,1);
	        
	    }
	}
}