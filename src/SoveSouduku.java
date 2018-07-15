
import java.util.Scanner;



public class SoveSouduku
{
    static int getSafeValue(int[][] p,int i,int j,int n,int x)
    {
        while(x<5)
        {
            int flag=0;
            int a = (int)Math.sqrt(n);
            for(int k=0;k<n;k++)
            {                
                if(p[i][k]==x || p[k][j]==x || p[((i / a) * a + k / a)][(i * a % n + k % a)]==x)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                return x;
            }
            x++;
        }
        return -1;
    }
    
    
    
    
    static boolean solveSudoku(int[][] p,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(p[i][j]==0)
                {
                    for(int x=getSafeValue(p,i,j,n,1);x<n+1;x++)
                    {
                        p[i][j]=x;
                        if(solveSudoku(p,n))
                        {
                            return true;
                        }
                        p[i][j]=0;
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int p[][]=new int[n][n];
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                p[i][j]=sc.nextInt();
//            }
//        } 
        
        int n=4;
        int[][] p={
            {0,0,0,0},
            {0,2,0,1},
            {4,0,2,0},
            {0,0,0,0}
        };

        if(solveSudoku(p,n))
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(p[i][j]+" ");
                }
                System.out.println();
            } 
        }
        else
        {
            System.out.println("No solution Exists");
        }
        
        
    }
}
