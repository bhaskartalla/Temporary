
import java.util.Scanner;
public class BreadthFirstSearch
{
    static  int Q[],front=-1,rear=-1,n,e;
    static int mat[][];
    static boolean v[];
    static void enQueue(int n)
    {
        if(rear==99998)
        {
            System.out.println("Queue is FULL");
        }
        else if(front==-1 && rear==-1)
        {
            front=rear=0;
            Q[rear]=n;
        }
        else
        {
            Q[++rear]=n;
        }
    }
    
    static int deQueue()
    {
        if(front==-1)
        {
            System.out.println("Queue is EMPTY");
        }
        else
        {
            return Q[front++];
        }
        return 0;
    }
    
    static void traverse(int s)
    {
        v[s]=true;
        enQueue(s);   
        while(!(front>rear))
        {
            s=deQueue();
            System.out.print(s+" ");            
            for(int x=1;x<n+1;x++)
            {        
                if(mat[s][x]==1 && !v[x]) 
                {
                    v[x]=true;
                    enQueue(x);                    
                }                
            }            
        }        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the nodes : ");
        n=sc.nextInt(); 
        //System.out.println("Enter the edges : ");
        e=sc.nextInt();
        mat=new int[n+1][n+1];
        v=new boolean[n+1];
        Q=new int[99999];
        int s,d;       
        
        for(int i=0;i<e;i++)
        {        
            s=sc.nextInt();
            d=sc.nextInt();                
            mat[s][d]=1;
            mat[d][s]=1;             
        }     
        traverse(1);
    }      
}
