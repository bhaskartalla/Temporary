import java.util.Scanner;
public class Knapsack 
{
    static int val[],wgt[],knap[][];
    
   //-------------------------------TOP DOWN APPROACH--------------------------------------
    
//    
//    static int getMaxValue(int w,int n)
//    {        
//        if(n==0 || w==0)
//        {
//            return 0;
//        }
//        else if(wgt[n-1] > w )
//        {
//            if(knap[n][w]==0)
//            {
//                return knap[n][w]=getMaxValue(w,n-1);
//            }
//            return knap[n][w];
//        }
//        else 
//        {
//            if(knap[n][w]==0)
//            {
//                return knap[n][w]=Math.max(val[n-1]+getMaxValue(w-wgt[n-1],n-1),getMaxValue(w,n-1));
//            }
//            return knap[n][w];
//        }        
//    }
    
    
    //-------------------------------BOTTOM UP APPROACH--------------------------------------
    
    static int getMaxValue(int w,int n)
    {       
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<w+1;j++)
            {
                if(i==0 || j==0)
                {
                    knap[i][j]=0;
                }
                else if(wgt[i-1]>j)
                {
                    knap[i][j]=knap[i-1][j];
                }
                else
                {
                    knap[i][j]=Math.max(val[i-1]+knap[i-1][j-wgt[i-1]],knap[i-1][j]);
                }
            }
        }
       return knap[n-1][w];    
    }
    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        val=new int[n];
        wgt=new int[n];
        for(int i=0;i<n;i++)
        {
            val[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            wgt[i]=sc.nextInt();
        }
        int w=sc.nextInt();
        knap=new int[n+1][w+1];           
        
        System.out.println(getMaxValue(w,n));
        
        for (int i = 1; i < n + 1; i++)
        {         
            for (int j = 0; j < w + 1; j++)
            {
                System.out.print(knap[i][j] + " ");
            }
            System.out.println();
        }          
    }    
}


