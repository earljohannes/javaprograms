/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.ArrayList;
import java.util.Comparator;



public class ratInMaze
{
    public static ArrayList<String> al;
    
    public static ArrayList<String> printPath(int[][] m, int N)
    {
        al = new ArrayList<String>();
        StringBuffer s = new StringBuffer("");
        
        rat(m,s,N,0,0);
        al.sort(new Comp());
        
        return al;
    }
    
    public static void rat(int[][] m, StringBuffer sb, int N, int i, int j)
    {
        if(i>=N || j>=N)
            return;
        
        if(i<0 || j<0)
            return;
        
        if(m[i][j]==0)
            return;
        
        if(i==N-1 && j==N-1)
        {
            String s = sb.toString();
            al.add(s);
            return;
        }
        
        m[i][j] = 0;
        
        sb.append("D");
        rat(m,sb,N,i+1,j);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append("R");
        rat(m,sb,N,i,j+1);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append("U");
        rat(m,sb,N,i-1,j);
        sb.deleteCharAt(sb.length()-1);
        
        sb.append("L");
        rat(m,sb,N,i,j-1);
        sb.deleteCharAt(sb.length()-1);
        
        m[i][j] = 1;
        
    }
}

class Comp implements Comparator
{
    public int compare(Object o1, Object o2)
    {
        String s1 = (String) o1;
        String s2 = (String) o2;
        
        return s1.compareTo(s2);
    }
}