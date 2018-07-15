
import java.util.Scanner;

public class FloydWarshall
{

    static int n;

    static void findShortestPath(int[][] mat)
    {
        int dist[][] = mat;
        for (int k = 1; k < n + 1; k++)
        {
            for (int i = 1; i < n + 1; i++)
            {
                for (int j = 1; j < n + 1; j++)
                {
                    if (dist[i][j] > dist[i][k] + dist[k][j])
                    {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < n + 1; j++)
            {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of nodes");
        n = sc.nextInt();
        System.out.println("Enter no. of edges");
        int e = sc.nextInt();
        int mat[][] = new int[n + 1][n + 1];
        int s, d, w;

        for (int i = 0; i < e; i++)
        {
            s = sc.nextInt();
            d = sc.nextInt();
            w = sc.nextInt();
            mat[s][d] = w;
        }

        for (int i = 1; i < n + 1; i++)
        {
            for (int j = 1; j < n + 1; j++)
            {
                if (i != j && mat[i][j] == 0)
                {
                    mat[i][j] = 99;//Integer.MAX_VALUE;
                }
            }
        }
        findShortestPath(mat);
    }

}
