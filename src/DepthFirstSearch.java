
import java.util.Scanner;

public class DepthFirstSearch
{

    static int S[], top = -1, n, e;
    static int mat[][];
    static boolean v[];

    static void push(int n)
    {
        if (top == 99998)
        {
            System.out.println("Stack if FULL");
        }
        else
        {
            S[++top] = n;
        }
    }

    static int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack if EMPTY");
        }
        else
        {
            return S[top--];
        }
        return 0;
    }

    static void traverse(int s)
    {
        v[s] = true;
        push(s);
        while (top != -1)
        {
            s = pop();
            System.out.print(s + " ");
            for (int x = 1; x < n + 1; x++)
            {
                if (mat[s][x] == 1 && !v[x])
                {
                    v[x] = true;
                    push(x);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the nodes : ");
        n = sc.nextInt();
        //System.out.println("Enter the edges : ");
        e = sc.nextInt();
        mat = new int[n + 1][n + 1];
        v = new boolean[n + 1];
        S = new int[99999];
        int s, d;

        for (int i = 0; i < e; i++)
        {
            s = sc.nextInt();
            d = sc.nextInt();
            mat[s][d] = 1;
            mat[d][s] = 1;
        }
        traverse(1);
    }
}
