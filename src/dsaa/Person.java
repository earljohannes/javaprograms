package dsaa;

import java.io.*;
import java.lang.*;
import java.util.*;


class CT implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Person p1 = (Person) o1;
        Person p2 = (Person) o2;
        
        if(p1.getID() > p2.getID())
            return 1;
        
        else if(p1.getID() < p2.getID())
            return -1;
        
        else
            return 0;
    }
}

public class Person
{
    int Id;
    String fName;
    String lName;
    
    Person(int id)
    {
        Id = id;
    }
    
    public void setFN(String firstName)
    {
        this.fName = firstName;
    }

    public void setLN(String lastName)
    {
        this.lName = lastName;
    }

    public int getID()
    {
        return this.Id;
    }
    
    public String getFirstName()
    {
        return fName;
    }
    
    public String getLastName()
    {
        return lName;
    }
    
    public void Print()
    {
        System.out.print(getID()+" - "+getFirstName()+" "+getLastName()+" - ");
    }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            
            //Should be assigned = 90
            int N = sc.nextInt();
            ArrayList<Person> al = new ArrayList<Person>();



            for(int i=0; i<N; i++)
            {
                int id = sc.nextInt();
                String firstName = sc.next();
                String lastName = sc.next();
                
                
                Person p = new Person(id);
                p.setFN(firstName);
                p.setLN(lastName);
                
                al.add(p);
            }
            
            Collections.sort(al, new CT());
            
            for(int i=0; i<N; i++)
            {
                if(al.get(i).getID()%3==0 && al.get(i).getID()%5!=0)
                {
                    al.get(i).Print();
                    System.out.println("LOAN");
                }
                
                else if(al.get(i).getID()%3!=0 && al.get(i).getID()%5==0)
                {
                    al.get(i).Print();
                    System.out.println("Pending");
                }
                
                else if(al.get(i).getID()%3==0 && al.get(i).getID()%5==0)
                {
                    al.get(i).Print();
                    System.out.println("LOAN Pending");
                }
                
                else
                {
                    al.get(i).Print();
                    System.out.println("no data");
                }
            }
            
            
            


        }
}