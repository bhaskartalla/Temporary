
import java.util.Scanner;

public class NQueen
{
    static int n;
    static boolean isSafe(int mat[][],int row,int col)
    {
        for(int i=0;i<col;i++)
        {
            if(mat[row][i]==1)
            {
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
        {
            if(mat[i][j]==1)
            {
                return false;
            }
        }
        for(int i=row,j=col;i<n && j>=0;i++,j--)
        {
            if(mat[i][j]==1)
            {
                return false;
            }
        }       
        return true;
    }    
    static boolean solveNQueen(int mat[][],int col)
    {
        if(col>=n)
        {
            return true;
        }       
        for(int i=0;i<n;i++)
        {
            if(isSafe(mat,i,col))
            {
                mat[i][col]=1;
                
                if(solveNQueen(mat,col+1))
                {
                    return true;
                }              
                
                mat[i][col]=0;                
            }
        }      
        return false;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int mat[][]=new int[n][n];
        
        if(solveNQueen(mat,0))
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(mat[i][j]==1)
                    {
                        System.out.println(i+" "+j);
                    }
                }
            }
        }
        else
        {
            System.out.println("No Solution exists");
        }       
    }
}
