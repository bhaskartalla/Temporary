
import java.util.Scanner;


public class StackSort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int ci=0;
        while(ci<n)
        {
            int max=Integer.MIN_VALUE,pos=0;

            for(int i=n-1;i>=ci;i--)
            {
                if(max<a[i])
                {
                    max=a[i];
                    pos=i;
                }
            }

            int temp=0,x=pos,y=n-1;

            while(x<=y)
            {
                temp=a[x];
                a[x]=a[y];
                a[y]=temp;
                x++;
                y--;
            }
            x=ci;y=n-1;
            while(x<=y)
            {
                temp=a[x];
                a[x]=a[y];
                a[y]=temp;
                x++;
                y--;            
            }  
            ci++;
        }
        
         for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
