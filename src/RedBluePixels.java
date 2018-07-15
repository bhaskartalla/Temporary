import java.util.Scanner;
public class RedBluePixels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        int k=sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        L2:
        for(int x=1;x<n;x++)
        {
            for(int t=0;t<x*x;t++)
            {
                L1:
                for(int i=t,c=0;i<=n-x+t;i++)
                {
                    for(int j=0;j<n-x+t;j++)
                    {
                        if(mat[i][j]==0)
                        {
                            c++;
                        }
                        if(c>k)
                        {
                            flag=1;
                            break L1;
                        }
                    }
                }
                if(flag==1)
                {
                    flag=0;
                    break;
                }
                else
                {
                    System.out.println(n-x+t);
                    break L2;
                }
            }
        }   
    }   
}
