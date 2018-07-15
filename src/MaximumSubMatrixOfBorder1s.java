
import java.util.Scanner;

public class MaximumSubMatrixOfBorder1s
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        int hor[][] = new int[n][n];
        int ver[][] = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if ((i == 0 || j == 0) && mat[i][j] != 0)
                {
                    if (i == 0 && j != 0)
                    {
                        ver[i][j] = 1;
                        hor[i][j] = hor[i][j - 1] + 1;
                    }
                    if (j == 0 && i != 0)
                    {
                        ver[i][j] = ver[i - 1][j] + 1;
                        hor[i][j] = 1;
                    }
                    if (i == 0 && j == 0)
                    {
                        ver[i][j] = 1;
                        hor[i][j] = 1;
                    }
                }
                else if (mat[i][j] != 0)
                {
                    ver[i][j] = ver[i - 1][j]+1;
                    hor[i][j] = hor[i][j - 1]+1;
                }
            }
        }
        int z = 0, max = 0;
        for (int x = n - 1; x > 0; x--)
        {
            for (int y = n - 1; y > 0; y--)
            {
                z = Math.min(hor[x][y], ver[x][y]);
                while (z > 0)
                {
                    if ((ver[x][z - y + 1] >= z && hor[z - x + 1][y] >= z) && z > max)
                    {
                        max = Math.max(z, max);
                        break;
                    }
                    z -= 1;
                }
            }
        }
        System.out.println(max);
    }
}
