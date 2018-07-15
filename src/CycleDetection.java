
import java.util.Scanner;


public class CycleDetection
{
    static  int n,e,mat[][],v[],dfn=1,p[];

    static boolean isCycle(int s)
    {
        v[s]=dfn++;        
        //System.out.println(s+"  ");
        for(int j=1;j<=n;j++)
        {
            if(v[j]==0 && mat[s][j]==1)
            {
                p[j]=s;                
                boolean x=isCycle(j);
                if(x)
                {
                    return true;
                }
            }
            else if(p[s]!=j && v[j]<v[s] && mat[s][j]==1)
            {
                return true;
            }
        }
        return false;
    }
    
    
    public static void main(String[] args)
    {        
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the nodes : ");
        n=sc.nextInt(); 
        //System.out.println("Enter the edges : ");
        e=sc.nextInt();
        mat=new int[n+1][n+1];
        v=new int[n+1];
        p=new int[n+1];        
        int s,d;       
        
        for(int i=0;i<e;i++)
        {         
            s=sc.nextInt();
            d=sc.nextInt();                
            mat[s][d]=1;
            mat[d][s]=1;             
        }   
        System.out.println(isCycle(3));
    }
}
