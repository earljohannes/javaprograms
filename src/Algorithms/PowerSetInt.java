
package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class PowerSetInt 
{

    public static ArrayList<Integer> cloneSet(ArrayList<Integer> input)
    {
        ArrayList<Integer> clone = new ArrayList();

        for (int i = 0;  i < input.size(); i++)
        {
            clone.add(input.get(i));
        }

        return clone;
    }


    public static void findAllSubsets(ArrayList<ArrayList<Integer>> allSubsets, ArrayList<Integer>InputSet, int currIndex)
    {
        if (currIndex == InputSet.size())
        {
            return;
        }
        
        int allSubSetsSize = allSubsets.size();  
        ArrayList<Integer> newSet;

        for (int i = 0; i < allSubSetsSize; i++)
        {
            // allSubSetSize = allSubset.size();
            
            newSet = cloneSet(allSubsets.get(i));
            newSet.add(InputSet.get(currIndex));
            allSubsets.add(newSet);
            
            // allSubSetSize != allSubset.Size()
        }

        findAllSubsets(allSubsets, InputSet, currIndex+1);
    }


    public static void main(String[] args) 
    {
        ArrayList InputSet = new ArrayList();
        for(int i=1; i<=3; i++)
            InputSet.add(i);
        
        ArrayList<ArrayList<Integer>> allSubsets = new ArrayList(2^(InputSet.size()));
        allSubsets.add(new ArrayList<Integer>());
        findAllSubsets(allSubsets, InputSet, 0);
        
        System.out.println(allSubsets);

    }
    
}
