


import java.util.Scanner;
public class LongestIncreasingSubsequence 
{
    
    
    
/*------------     O(N^2) TIME COMPLEXITY     --------------------------------*/
    
//    static int LIS(int a[],int n)
//    {
//        int l[]=new int[n];         
//        for(int i=1;i<n;i++)
//        {
//            for(int j=0;j<i;j++)
//            {
//                if(a[i] > a[j] && l[i] < l[j]+1)
//                {
//                    l[i]=l[j]+1;
//                }
//            }            
//        }
//        int max = 0;
//        for(int i=0;i<n;i++)
//        {
//            if(max<l[i])
//            {
//                max = l[i];
//            }            
//        }
//        return max+1;
//    }
//    
    
/*-------------------------O(NLOGN) TIME COMPLEXITY--------------------------------*/
    
    
    static int LIS(int X[],int n)
    {
        int parent[]= new int[n];  
        int increasingSub[]= new int[n + 1];  
        int length = 0;  
        for(int i=0; i<n; i++)
        {
            int low = 1;
            int high = length;
            while(low <= high)
            {
                int mid = (int) Math.ceil((low + high)/2);
                if(X[increasingSub[mid]] < X[i])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            int pos = low;
            parent[i] = increasingSub[pos-1];
            increasingSub[pos] =  i;
            if(pos > length)
                length=pos;
        }
        int LIS[] = new int[length];
        int k     = increasingSub[length];
        for(int j=length-1; j>=0; j--)
        {
            LIS[j] =  X[k];
            k = parent[k];
        }
        return LIS.length;
    }
    
    
    
/*----------------------------------------------------------------------------*/
   
//    
//    static int LIS(int a[],int n)
//    {
//        int sub[]=new int[n];
//        int len=1;
//        sub[0]=a[0];
//        
//        for(int i=1;i<n;i++)
//        {
//            if(a[i]>sub[len-1])
//            {
//                sub[len]=a[i];                
//                len++;
//            }
//            else
//            {                
//                for(int j=len-1;j>=0;j--)
//                {
//                    if(a[i]>sub[j])
//                    {
//                        sub[j+1]=a[i];  
//                        break;
//                    }
//                    if(j==0)
//                    {
//                        sub[j]=a[i];
//                        break;
//                    }
//                }
//            }
//        }
//        return len;
//    }
//    
   
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n]; 
        //String s=sc.next();
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }        
        System.out.println(LIS(a,n));
    }
}

