
import java.text.DecimalFormat;
import java.util.Scanner;


public class RodCutting
{
    static int calls=0;
    static int rodCutting1(int p[],int n)
    {
        calls++;
        if(n<=0)
        {
            return 0;
        }
        int x=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            x = Math.max(x,p[i]+rodCutting1(p,n-i-1));           
        }
        return x;
    }
    
    
    static int rodCutting2(int p[],int n)
    {
        int m[]=new int[n+1];        
        return memoizedCutRod(p,n,m);
    }
    
    static int memoizedCutRod(int p[],int n,int m[])
    {
        calls++;
        if(m[n]>0)
        {
            return m[n];
        }
        else
        {
            int x=0;
            for(int i=0;i<n;i++)
            {
                x = Math.max(x,p[i]+memoizedCutRod(p,n-i-1,m));           
            }
            return m[n]=x;
        }
    }
    
    static int rodCutting3(int p[],int n)
    {
        int m[]=new int[n+1];
        m[0]=0;
              
        for(int j=1;j<=n;j++)
        {
            int x=0;
            for(int i=0;i<j;i++)
            {
                x=Math.max(x, p[i]+m[j-i-1]);
            }
            m[j]=x;
        }        
        return m[n];
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
        int n=10;
        int p[]={1,5,8,9,10,17,17,20,24,30};
        
        
        for(int z=1;z<10;z++)
        {
            System.out.print(z+"  "+rodCutting1(p,z));
            System.out.println("     Calls : "+calls);
            calls=0;
        }
        System.out.println("\n\n");
        for(int z=1;z<10;z++)
        {
            System.out.print(z+"  "+rodCutting2(p,z));
            System.out.println("     Calls : "+calls);
            calls=0;
        }
        System.out.println("\n\n");
        for(int z=1;z<10;z++)
        {
            System.out.print(z+"  "+rodCutting3(p,z));
            System.out.println("     Calls : "+calls);
            calls=0;
        }
           
    }
}