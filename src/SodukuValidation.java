
import java.lang.*;
import java.util.*;

public class SodukuValidation 
{
    static boolean isSolved(int p[][],int n)
    {
        int r[]=new int[n];
        int c[]=new int[n];
        int b[]=new int[n];
        int x = (int)Math.sqrt(n);
        for(int i=0;i<n;i++)
        {
            Arrays.fill(r, -1);
            Arrays.fill(c, -1);
            Arrays.fill(b, -1);
    
            for(int j=0;j<n;j++)
            {          
                int rv=p[i][j];
                int cv=p[j][i];
                int bv=p[((i / x) * x + j / x)][(i * x % n + j % x)];
                
                if(r[rv-1]==-1 && c[cv-1]==-1 && b[bv-1]==-1)
                {
                    r[rv-1]=rv;
                    c[cv-1]=cv;
                    b[bv-1]=bv;
                }       
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int p[][]=new int[n][n];

//        for(int j=0;j<n;j++)
//        {
//            for(int i=0;i<n;i++)
//            {
//                p[i][j]=sc.nextInt();
//            }
//        } 
        
//        int n=9;
//        int[][] p={
//                    {5,3,4,6,7,8,9,1,2},
//                    {6,7,2,1,9,5,3,4,8},
//                    {1,9,8,3,4,2,5,6,7},
//                    {8,5,9,7,6,1,4,2,3},
//                    {4,2,6,8,5,3,7,9,1},
//                    {7,1,3,9,2,4,8,5,6},
//                    {9,6,1,5,3,7,2,8,4},
//                    {2,8,7,4,1,9,6,3,5},
//                    {3,4,5,2,8,6,1,7,9}
//                };

//        int n=4;
//        int[][] p={
//            {1,4,3,2},
//            {3,2,4,1},
//            {4,1,2,3},
//            {2,3,1,4}
//        };  
        
        
//        System.out.println(isSolved(p,n));
        
        int i=0,j=2,n=4;
        int a=(int)Math.sqrt(n);
        for(int k=0;k<4;k++)
        {
            System.out.println("i : "+((i / a) * a + k / a)+"   j : "+(j * a % n + k % a));         
        } 
        
    }
}
