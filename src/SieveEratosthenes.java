
import java.util.Scanner;

public class SieveEratosthenes
{
    static boolean[] sieveOfEratosthenes(int n)
    {
        boolean p[] = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++)
        {
            if (!p[i])
            {
                for (int j = i * 2; j <= n; j += i)
                {
                    p[j] = true;
                }
            }
        }
        return p;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 10000000;//sc.nextInt();
        boolean p[] = sieveOfEratosthenes(n);
        int x=1000;
        for (int i = 2;i<=n; i++)
        {
            if (!p[i])
            {
                System.out.println(i + " ");
            }
        }
    }

}


