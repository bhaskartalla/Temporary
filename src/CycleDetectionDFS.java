
import java.util.Arrays;
import java.util.Scanner;

public class CycleDetectionDFS
{
    static int S[], top = -1, n, e;
    static int mat[][],p[];
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

    static boolean isCycleDetectedIterative(int s)
    {
        push(s);
        v[s] = true;
        p[s] = -1;
        while(top != -1)
        {
            s = pop();
            System.out.print(s+"   ");
            
            for(int i=1;i<v.length;i++)
            {
                if(mat[s][i] == 1 && !v[i])
                {
                    push(i);
                    v[i] = true;
                    p[i] = s;
                }
                else if (mat[s][i] == 1 && v[i] && p[s] != i)
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    
    static boolean isCycleDetectedRecursive(int s)
    {
        v[s] = true;
        System.out.print(s+"   ");
            for(int x=1;x<v.length;x++)
        {
            if(mat[s][x] == 1 && !v[x])
            {
                p[x] = s;
                isCycleDetectedRecursive(x);
            }
            else if(mat[s][x] == 1 && v[x] && p[s] != x)
            {
                return true;
            }
        }
        return false;
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
        p = new int[n + 1];
        
        S = new int[99999];
        int s, d;

        for (int i = 0; i < e; i++)
        {
            s = sc.nextInt();
            d = sc.nextInt();
            mat[s][d] = 1;
            mat[d][s] = 1;
        }
        boolean b1 = isCycleDetectedIterative(1);
        System.out.println();
        Arrays.fill(v, false);
        Arrays.fill(p, 0);
        boolean b2 = isCycleDetectedRecursive(1);
        
        System.out.println(b1);
        System.out.println(b2);
    }
}

