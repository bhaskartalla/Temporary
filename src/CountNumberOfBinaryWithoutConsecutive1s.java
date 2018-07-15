
import java.util.Scanner;

//new comment added for GitHub


public class CountNumberOfBinaryWithoutConsecutive1s
{

    public int count(int n)
    {
        int a[] = new int[n];
        int b[] = new int[n];
        a[0] = 1;
        b[0] = 1;
        for (int i = 1; i < n; i++)
        {
            a[i] = a[i - 1] + b[i - 1];
            b[i] = a[i - 1];
        }
        return a[n - 1] + b[n - 1];
    }

    public int countSimple(int n)
    {
        int a = 1;
        int b = 1;
        for (int i = 1; i < n; i++)
        {
            int tmp = a;
            a = a + b;
            b = tmp;
        }

        return a + b;
    }

    int mem[];

    int countRecursive(int n)
    {
        if (n == 1)
        {
            return 2;
        }
        if (n == 2)
        {
            return 3;
        }
        if (mem[n] != 0)
        {
            return mem[n];
        }
        return mem[n] = countRecursive(n - 1) + countRecursive(n - 2);
    }

    int countLooping(int n)
    {
        mem[0] = 2;
        mem[1] = 3;
        for (int i = 2; i < n; i++)
        {
            mem[i] = mem[i - 2] + mem[i - 1];
        }
        return mem[n - 1];
    }

    public static void main(String args[])
    {
        CountNumberOfBinaryWithoutConsecutive1s cnb = new CountNumberOfBinaryWithoutConsecutive1s();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cnb.mem = new int[99999];
        System.out.println(cnb.count(n));
    }
}

