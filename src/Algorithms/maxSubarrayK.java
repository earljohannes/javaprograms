package src.Algorithms;

import java.util.*;

public class maxSubarrayK
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] A = new int[N];
            int max = Integer.MIN_VALUE;
            Deque<Integer> q = new LinkedList<Integer>();
            

            for(int i=0; i<N; i++)
            {
                A[i] = sc.nextInt();
                if(i<K)
                {
                    if(A[i]>max)
                    {
                        q.addFirst(max);
                        max = A[i];
                    }

                    else if(A[i]<max && A[i]>q.peek())
                    {
                        q.addFirst(A[i]);
                    }

                    else;

                    if(q.size()>K)
                        q.removeLast();
                }
            }

            int i=0, j=K-1;
            while(i<N-K)
            {
                System.out.println(max);
                if(max==A[i])
                {
                    q.pollFirst();
                    max = q.pollFirst();
                }

                if(q.peekFirst()==A[i])
                {
                    q.pollFirst();
                }

                i++;

                j++;
                if(A[j]>max)
                {
                    q.addFirst(max);
                    max = A[i];

                    if(q.size()>K)
                        q.removeLast();
                    
                    max = A[j];
                }

                else if(A[i]<max && A[i]>q.peek())
                {
                    q.addFirst(A[i]);
                }

                else;

                if(q.size()>K)
                    q.removeLast();
            }
            
        }

        sc.close();
    }
}