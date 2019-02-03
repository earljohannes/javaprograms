/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Arrays;
import java.util.Comparator;


/**
 *
 * @author Harry
 */
class pair
{
    int x;
    int y;
    
    pair(int a, int b)
    {
        x = a;
        y = b;
    }
}

class CompareByFirst implements Comparator<pair>
{
   public int compare(pair a, pair b)
    {
        return a.x - b.x;
    }
}

public class MaxChainLength
{
    int maxChainLength(pair arr[], int n)
    {
        Arrays.sort(arr, new CompareByFirst());
        int i, j, max = 0;
        int mcl[] = new int[n];
      
       
        for(i = 0; i < n; i++ )
            mcl[i] = 1;
            
            
        for(i = 1; i < n; i++ )
            for( j = 0; j < i; j++ )
                if( arr[i].x > arr[j].y && mcl[i] < mcl[j] + 1)
                    mcl[i] = mcl[j] + 1;
      
       
        for(i = 0; i < n; i++ )
            if ( max < mcl[i] )
                max = mcl[i];
      
        return max;
    }
}