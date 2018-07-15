
import java.util.Scanner;


public class QuickFind
{
    int id[]; 
    QuickFind(int n)
    {
        id = new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            id[i] = i;
        }
    }
    
    boolean isConnected(int p,int q)
    {
        return id[p] == id[q];
    }
    
    void union(int p,int q)
    {
        if(id[p] != id[q])
        {
            int pid = id[p];
            int qid = id[q];
            
            for(int i=0;i<id.length;i++)
            {
                if(id[i] == pid)
                {
                    id[i] = qid;
                }
            }            
        }
    }    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        QuickFind qf = new QuickFind(n);
        int s = 0,d = 0;
        
        for(int i=0;i<n;i++)
        {
            s = sc.nextInt();
            d = sc.nextInt(); 
            if(!qf.isConnected(s, d))
            {
                qf.union(s, d);                
            }
            else
            {
                System.out.println("true");
            }
        }        
    }
}
