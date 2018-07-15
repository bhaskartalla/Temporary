
import java.util.Scanner;

public class DPP
{
    int DP[]=new int[10];
        
    static int calls = 0;
    static int memo[]=null;
    static int fib1(int n)
    {
        calls++;
        if(n==0)
        {
            return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return fib1(n-1)+fib1(n-2);
        }
    }
    
    static int fib2(int n)
    {
        calls++;
        if(n==0)
        {
            return 0;
        }
        else if(memo[n] != 0)
        {
            return memo[n];
        }
        else
        {
            return memo[n] = fib2(n-1) + fib2(n-2);
        }
    }

    static int fib(int n , int[] memo)
    {
        if(memo[n]==0)
        {
            if(n<2)
            {
                if(n==0)
                {
                    return 0;
                }
                else
                {
                    return 1;
                }                    
            }
            else 
            {
                memo[n]=fib(n-1,memo)+fib(n-2,memo);
            }
        }           
        return memo[n];
    }

    static int dp(int n)
    {
        if(n==0 || n==1 || n==2 )
        {
            return 1;
        }
        else if(n==3)
        {
            return 2;
        }
        return (dp(n-1)+dp(n-3)+dp(n-4));
    }

//        int  fib (int n)
//        {
//            DP[0] = DP[1] = DP[2] = 1;  DP[3]=2;
//            for (int i = 4; i <= n; i++)
//            {
//                DP[i] = DP[i-1] + DP[i-3] + DP[i-4];
//            }
//            return DP[n];
//        } 
       
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        DPP s=new DPP();       
     //   System.out.println(dp(5));
        System.out.println(fib(5,new int[6]));
        System.out.println(fib1(5));
        for(int x=1;x<20;x++)
        {
            memo = new int[x+1];
            memo[0]=0;
            memo[1]=1;       
            System.out.println(" -------------------------  "+x+" ------------------------- ");
            System.out.println(fib1(x)+" calls of fib1 : "+calls);
            int c1 = calls;
            calls = 0;
            System.out.println(fib2(x)+" calls of fib2 : "+calls);
            int c2 = calls;
            calls = 0;
            System.out.println("Diff : "+(c1-c2));
        }
    }

}


