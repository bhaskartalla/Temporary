import java.util.Scanner;

public class GameofTwoStacks 
{
    static void rev(char c[],int i)
    {
        if(i==c.length-1)
        {
            System.out.print(c[i]);
            return;
        }
        rev(c,i+1);
        System.out.print(c[i]);
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        rev("987654321".toCharArray(),0);
        for(int t=sc.nextInt();t>0;t--)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int a[]=new int[n];
            int b[]=new int[m];
            int c=0,sum=0;
            
            for(int i=n-1,j=m-1;i>=0 && j>=0;)
            {
                if(a[i]>b[j])
                {
                    sum+=a[i];
                    i--;
                }
                else
                {
                    sum+=b[j];
                    j--;
                }                
                if(sum>x)
                {
                    break;
                }
                c++;
            }
            System.out.println(c);
        }
        
    }
    
}
