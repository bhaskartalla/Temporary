//
//import java.util.Scanner;
//
//
//public class MinimumJumpstoReachEnd
//{
//    static int minJumps(int a[],int n)
//    {
//        int jp[]=new int[n];
//        int aj[]=new int[n];
//        aj[0]=a[0];
//        for(int i=1;i<n;i++)
//        {
//            jp[i]=Integer.MAX_VALUE;
//        }        
//        for(int i=1;i<n;i++)
//        {
//            for(int j=0;j<i;j++)
//            {
//                if(j+a[j]>=i)
//                {
//                    jp[i]=Math.min(jp[j]+1,jp[i]);                                        
//                }
//            }
//        }        
//        return jp[n-1];
//    }
//    
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n=10;//sc.nextInt();
//        //int a[]={2,3,1,1,2,4,2,0,1,1};//new int[n];
//        int a[]={1,4,3,7,1,2,6,7,6,10};
////        for(int i=0;i<n;i++)
////        {
////            a[i]=sc.nextInt();
////        }
//        
//        System.out.println(minJumps(a,n));
//        
//    }
//}
//



/* Java program for Dynamic Programming implementation
   of Min Cost Path problem */
import java.util.*;
 
class MinimumCostPath
{
    /* A utility function that returns minimum of 3 integers */
    private static int min(int x, int y, int z)
    {
        if (x < y)
            return (x < z)? x : z;
        else
            return (y < z)? y : z;
    }
 
    private static int minCost(int cost[][], int m, int n)
    {
        int i, j;
        int tc[][]=new int[m+1][n+1];
 
        tc[0][0] = cost[0][0];
 
        /* Initialize first column of total cost(tc) array */
        for (i = 1; i <= m; i++)
            tc[i][0] = tc[i-1][0] + cost[i][0];
 
        /* Initialize first row of tc array */
        for (j = 1; j <= n; j++)
            tc[0][j] = tc[0][j-1] + cost[0][j];
 
        /* Construct rest of the tc array */
        for (i = 1; i <= m; i++)
            for (j = 1; j <= n; j++)
                tc[i][j] = min(tc[i-1][j-1], 
                               tc[i-1][j],
                               tc[i][j-1]) + cost[i][j];
 
        return tc[m][n];
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                       {4, 8, 2},
                       {1, 5, 3}};
        System.out.println("minimum cost to reach (2,2) = " +
                                         minCost(cost,2,2));
    }
}
// This code is contributed by Pankaj Kumar