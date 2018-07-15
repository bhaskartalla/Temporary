import static java.lang.Math.log10;
import java.util.Scanner;
public class MatrixZero
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        int cmat[][] = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                cmat[i][j] = -1;
            }
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] == 0)
                {
                    for (int x = 0; x < n; x++)
                    {
                    }
                    for (int y = 0; y < n; y++)
                    {
                        cmat[y][j] = 0;
                    }
                } else if (cmat[i][j] == -1)
                {
                    cmat[i][j] = mat[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(cmat[i][j] + " ");
            }
            System.out.println();
        }
        
    }

}
