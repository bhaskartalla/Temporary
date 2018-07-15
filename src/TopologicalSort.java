
import java.util.Scanner;
import java.util.Stack;

public class TopologicalSort
{
    static  int top=-1,n,e;
    static int mat[][];
    static boolean v[];
    static Stack s;
    
    static void explore(int j)
    {     
        v[j]=true;
        for(int x=1;x<=n;x++)
        {
            if(!v[x] && mat[j][x]==1)
            {
                explore(x);
            }
        }   
        s.push(j);
    }
    
    static int[] topologicalSort(int[][] mat)
    {
        int ts[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            if(!v[i])
            {                
                explore(i);
            }                       
        }
        for(int i=0;i<n;i++)
        {
            ts[i]=(int)s.pop();
        }
        return ts;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        e=sc.nextInt();
        mat=new int[n+1][n+1];
        v=new boolean[n+1];
        s=new Stack();
        int s=0,d=0;
        for(int i=0;i<e;i++)
        {
            s=sc.nextInt();
            d=sc.nextInt();
            mat[s][d]=1;
        }
        
        int ts[]=topologicalSort(mat);
        
        for(int i=0;i<n;i++)
        {            
            System.out.print(ts[i]+" ");
        }
    }   
}




