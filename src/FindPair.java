
import java.util.HashMap;
import java.util.Scanner;


public class FindPair
{
    
/********************* n*n ****************************************************/
    
//    static void findPair(int a[],int n,int x)
//    {
//        L:
//        for(int i=0;i<n;i++)
//        {
//            for(int j=i+1;j<n;j++)
//            {
//                if(a[i]+a[j]==x)
//                {
//                    System.out.println(a[i]+" "+a[j]);
//                    return;
//                }
//            }
//        }
//        System.out.println("No Pair Found");
//    }
    
 /********************* n*Logn ****************************************************/

//    static int binarySearch(int a[],int s,int e,int z)
//    {        
//        while(s<=e)
//        {
//            int m=(s+e)/2;
//            if(a[m]==z)
//            {
//                return m;
//            }
//            else if(a[m]>z)
//            {
//                e=m-1;
//            }
//            else
//            {
//                s=m+1;
//            }
//        }
//        return -1;
//    }
//    static void findPair(int a[],int n,int x)
//    {
//        for(int i=0;i<n-1;i++)
//        {
//            int b=binarySearch(a,i+1,n-1,x-a[i]);
//            if(b!=-1)
//            {
//                System.out.println(a[i]+" "+a[b]);
//                return;
//            }
//        }        
//        System.out.println("No Pair Found");
//    }
    
/********************* n ****************************************************/
  
//    static void findPair(int a[],int n,int x)
//    {
//        for(int i=0,j=n-1;i<j;)
//        {
//            if(a[i]+a[j]==x)
//            {
//                System.out.println(a[i]+" "+a[j]);
//                return;
//            }
//            else if(a[i]+a[j]<x)
//            {
//                i++;
//            }
//            else
//            {
//                j--;
//            }
//        }        
//        System.out.println("No Pair Found");
//    }
    
/********************* n ****************************************************/
  
    static void findPair(int a[],int n,int x)
    {
        HashMap h=new HashMap();
        for(int i=0,j=n-1;i<n;i++)
        {
            if(h.containsKey(x-a[i]))
            {
                System.out.println(a[i]+" "+a[j]);
                return;
            }
            else
            {
                h.put(a[i],x-a[i]);
            }
        }        
        System.out.println("No Pair Found");
    }
     
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        findPair(a,n,x);        
    }
}
