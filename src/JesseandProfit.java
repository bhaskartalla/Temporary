
import java.util.Scanner;


public class JesseandProfit 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        int p[]=new int[n];
        int st=0,ed=0,min=Integer.MAX_VALUE,minp=Integer.MAX_VALUE,d;
        for(int i=0;i<n;i++)
        {
            p[i]=sc.nextInt();
        }         
        for(int x=0;x<q;x++)
        {              
            d=sc.nextInt();

            for(int i=0;i<n;i++)
            {
                if(p[i]<minp)
                {
                    minp=p[i];
                    st=i;
                    ed=i;
                }
                if(p[i]-minp==d)
                {
                    ed=i;
                }
                if(min>ed-st  && ed-st!=0)
                {
                    min=ed-st;
                }
            }
            System.out.println(st+" "+ed);
        }        
    }
    
}
