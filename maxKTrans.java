
import java.util.*;

class TransDet {
    int value;
    String type;

    TransDet(int value, String type) {
        this.type = type;
        this.value = value;
    }
}
public class maxKTrans {

    public static int M(ArrayList<TransDet> al, int Depth, int ind) {
        if(Depth==K)
            return 0;

        int N = al.size();
        int max = 0, res = 0;
        for(int i = ind+1; i<N; i++)
        {
            if(al.get(ind).type.equals("MX"))
            {
                if(al.get(i).type.equals("MN"))
                {
                    int res1 = al.get(i).value - al.get(ind).value + M(al, Depth+1, i);
                    int res2 = M(al, Depth, i);
                    
                    res = Math.max(res1, res2);
                }

            }

            if(al.get(ind).type.equals("MN"))
            {
                if(al.get(i).type.equals("MX"))
                    res = M(al, Depth, i);
            }
            max = Math.max(max, res);
        }
        return max;
    }
    public static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-->0)
        {
            K = sc.nextInt();
            int N = sc.nextInt();
            int[] A = new int[N];
            String[] S = new String[N];
            ArrayList<TransDet> al = new ArrayList<TransDet>();

            for(int i=0; i<N; i++)
            {
                A[i] = sc.nextInt();
            }

            for(int i=0; i<N; i++)
            {
                if(i==0)
                {
                    if(A[i]<A[i+1])
                        S[0] = "MN";

                    else
                        S[0] = "MX";

                    al.add(new TransDet(A[0], S[0]));
                }
                
                else if(i==N-1)
                {
                    if(A[i]<A[i-1])
                        S[N-1] = "MN";

                    else
                        S[N-1] = "MX";

                    al.add(new TransDet(A[N-1], S[N-1]));
                }
                

                else
                {
                    if(A[i]<A[i-1] && A[i]<A[i+1])
                    {
                        S[i] = "MN";
                        al.add(new TransDet(A[i], S[i]));
                    }

                    else if(A[i]>A[i-1] && A[i]>A[i+1])
                    {
                        S[i] = "MX";
                        al.add(new TransDet(A[i], S[i]));
                    }

                    else
                        S[i] = "doesn't matter";
                }
            }
            /*
            for(TransDet i: al)
                System.out.println(i.type+" "+i.value);
            */
            int ans = M(al, -1, 0);
            
            System.out.println(ans);

        }

        sc.close();
    }

}