

import java.util.Scanner;

public class MaximumSubarray 
{
    
//    static int maxProduct(int[] nums)
//    {
//        int[] max = new int[nums.length];
//        int[] min = new int[nums.length];
//
//        max[0] = min[0] = nums[0];
//        int result = nums[0];
//
//        for (int i = 1; i < nums.length; i++)
//        {
//            if (nums[i] > 0)
//            {
//                max[i] = Math.max(nums[i], max[i - 1] * nums[i]);
//                min[i] = Math.min(nums[i], min[i - 1] * nums[i]);
//            } 
//            else
//            {
//                max[i] = Math.max(nums[i], min[i - 1] * nums[i]);
//                min[i] = Math.min(nums[i], max[i - 1] * nums[i]);
//            }
//            result = Math.max(result, max[i]);
//        }
//        return result;
//    }
//    
    
    
//    static int maxProduct(int[] A) {
//    if (A.length == 0) {
//        return 0;
//    }    
//    int maxherepre = A[0];
//    int minherepre = A[0];
//    int maxsofar = A[0];
//    int maxhere, minhere;
//    
//    for (int i = 1; i < A.length; i++) 
//    {
//        maxhere = Math.max(Math.max(maxherepre * A[i], minherepre * A[i]), A[i]);
//        minhere = Math.min(Math.min(maxherepre * A[i], minherepre * A[i]), A[i]);
//        maxsofar = Math.max(maxhere, maxsofar);
//        maxherepre = maxhere;
//        minherepre = minhere;
//    }
//    return maxsofar;
//}
//    
//    
    public static void main(String[] args)
    {        
        Scanner sc = new Scanner(System.in);        
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();               
        }          


/*------------------------O(n*n) Time Complexity------------------------------*/


//            int sum,max=0;            
//            for(int i=0;i<n;i++)
//            {
//                sum=0;                
//                for(int j=i;j<n;j++)
//                {
//                    sum+=a[j]; 
//                    if(max<sum)
//                    {
//                        max=sum;
//                    }
//                }                 
//            } 


/*-----------    Kadane's Algorithm   O(n) Time Complexity  ------------------*/


        int max=0,me=0;
        for(int i=0;i<n;i++)
        {
            me+=a[i]; 

            if(me<0)
            {
                me=0;
            }
            if(max<me)
            {
                max=me;
            }         
        }    
        System.out.print(max); 
    }    
}





