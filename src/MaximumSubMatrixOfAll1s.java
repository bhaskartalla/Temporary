
import java.util.Scanner;

public class MaximumSubMatrixOfAll1s
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        int sub[][]=new int[n][n];
    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();   
                if(i==0 || j==0 || mat[i][j]==0)
                {
                   sub[i][j]=mat[i][j];
                }
            }
        }       
        
        int max=0;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {                                        
                if(mat[i][j]!=0)
                {
                    sub[i][j]=Math.min(sub[i][j-1],Math.min(sub[i-1][j-1], sub[i-1][j]))+1;
                    if(max<sub[i][j])
                    {
                        max=sub[i][j];
                    }
                }
            }
        }        
        System.out.println(max);  
        
    }   
}
