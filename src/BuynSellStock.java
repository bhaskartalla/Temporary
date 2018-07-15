import java.util.Scanner;
public class BuynSellStock 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p[]=new int[n];   
        int minp=Integer.MAX_VALUE,pf=0;
        for(int i=0;i<n;i++)
        {
            p[i]=sc.nextInt();
        }      
/*-----------------     METHOD 1    ------------------------------------------*/
        
        for(int i=0;i<n;i++)
        {
            if(p[i]<minp)
            {
                minp=p[i];
            }
            if(p[i]-minp>pf)
            {
                pf=p[i]-minp;
            }
        }
        
/*-----------------     METHOD 2    ------------------------------------------*/
       
        for(int i=0;i<n;i++)
        {
            pf=Math.max(pf,p[i]-minp);
            minp=Math.min(p[i], minp);
        }       
        System.out.println(pf);        
    }    
}

