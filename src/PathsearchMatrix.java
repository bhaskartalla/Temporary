import java.util.Scanner;

public class PathsearchMatrix
{    
    static  int n,e;
    static int mat[][];
    static boolean v[],x;
    
    static boolean search(int s,int t)
    {
        if(s==t)
        {
            return true;
        }
        v[s]=true;
        
        for(int j=1;j<=n;j++)
        {
            if(mat[s][j]==1 && !v[j])
            {
                x=search(j,t);
                if(x)
                {
                    return true;
                }
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
        v=new boolean[n+1];
        int s,d;       
        
        for(int i=0;i<e;i++)
        {        
            s=sc.nextInt();
            d=sc.nextInt();                
            mat[s][d]=1;
            mat[d][s]=1;             
        }     
        s=sc.nextInt();
        d=sc.nextInt();
        System.out.println(search(s,d));    
    }
}


