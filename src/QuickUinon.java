import java.util.Scanner;

public class QuickUinon
{
    int id[],size[]; 
    QuickUinon(int n)
    {
        id = new int[n+1];
        size = new int[n+1];
        
        for(int i=0;i<n+1;i++)
        {
            id[i] = i;
            size[i] = 1;
        }
    }
    
    int root(int i)
    {
        while(i != id[i])
        {
            id[i] = id[id[i]];
            i = id[i];
        }
        return i;
    }
    
    boolean isConnected(int p,int q)
    {
        return root(p) == root(q);
    }
    
    void union(int p,int q)
    {
        int pid = root(p);
        int qid = root(q);
        
        if(size[pid] > size[qid])
        {
            id[qid] = pid;
            size[pid] += size[qid];
        }
        else
        {
            id[pid] = qid;
            size[qid] += size[pid];
        }
    }    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        QuickUinon qu = new QuickUinon(n);
        int s = 0,d = 0;
        
        for(int i=0;i<n;i++)
        {
            s = sc.nextInt();
            d = sc.nextInt(); 
            if(!qu.isConnected(s, d))
            {
                qu.union(s, d);                
            }
            else
            {
                System.out.println("true");
            }
        }        
    }
}
