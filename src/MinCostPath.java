import java.util.Scanner;

public class MinCostPath
{
    static int calls = 0,memo[][];    
    static int findPath1(int mat[][],int sx,int sy,int dx,int dy)
    {
        calls++;
        if(sx == dx && sy == dy)
        {
            return mat[sx][sy];
        }
        else if(sx != mat.length-1 && sy != mat.length-1)
        {
            int c1 = findPath1(mat,sx+1,sy,dx,dy);
            int c2 = findPath1(mat,sx,sy+1,dx,dy);
            int c3 = findPath1(mat,sx+1,sy+1,dx,dy);
            return Math.min(c1, Math.min(c2, c3)) + mat[sx][sy];
        }
        else if(sx != mat.length-1)
        {
            return findPath1(mat,sx+1,sy,dx,dy) + mat[sx][sy];
        }        
        else 
        {
            return findPath1(mat,sx,sy+1,dx,dy) + mat[sx][sy];
        }
    }
       
    static int findPath2(int mat[][],int sx,int sy,int dx,int dy)
    {
        calls++;
        if(sx == dx && sy == dy)
        {
            return memo[sx][sy] = mat[sx][sy];
        }
        else if(memo[sx][sy] != 0)
        {
            return memo[sx][sy];
        }
        else if(sx != mat.length-1 && sy != mat.length-1)
        {
            int c1 = findPath2(mat,sx+1,sy,dx,dy);
            int c2 = findPath2(mat,sx,sy+1,dx,dy);
            int c3 = findPath2(mat,sx+1,sy+1,dx,dy);
            return memo[sx][sy] = Math.min(c1, Math.min(c2, c3)) + mat[sx][sy];
        }
        else if(sx != mat.length-1)
        {
            return memo[sx][sy] =findPath2(mat,sx+1,sy,dx,dy) + mat[sx][sy];
        }        
        else 
        {
            return memo[sx][sy] = findPath2(mat,sx,sy+1,dx,dy) + mat[sx][sy];
        }
    }
   
    static int findPath3(int mat[][],int sx,int sy,int dx,int dy)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==0 && j==0)
                {
                    memo[i][j]=mat[i][j];
                }
                else if(i==0)
                {
                    memo[i][j]=memo[i][j-1]+mat[i][j];
                }                
                else if(j==0)
                {
                    memo[i][j]=memo[i-1][j]+mat[i][j];
                }
                else
                {
                    memo[i][j]=Math.min(memo[i-1][j-1], Math.min(memo[i-1][j], memo[i][j-1]))  +mat[i][j];
                }
            }
        }
        return memo[mat.length-1][mat.length-1];
    }
  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int mat1[][] = { {1,2,2,3},
                        {4,1,2,4},
                        {1,5,1,6},
                        {1,5,1,1}};
        
        
         int mat[][] = {{1,3,5,8},
                        {4,1,1,7},
                        {4,3,1,1},
                        {0,0,0,0}};
        
//        int mat[][] = { {1,3,5},
//                        {4,2,1},
//                        {4,3,2}};
         
        int n = mat.length-1;
        memo = new int[n+1][n+1];
        
        System.out.print(findPath1(mat,0,0,n,n));
        System.out.println("    calls : "+calls);
        calls = 0;
        System.out.print(findPath2(mat,0,0,n,n));
        System.out.println("    calls : "+calls);
        System.out.println(findPath3(mat,0,0,n,n));
    }
}