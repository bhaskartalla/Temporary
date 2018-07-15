//
//import java.util.Scanner;
//
//public class PairsArraSumEqualk
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int k=sc.nextInt();
//        int a[]=new int[n];
//        for(int i=0;i<n;i++)
//        {
//            a[i]=sc.nextInt();
//        }
//        
//        int count=0,sum;
//        for(int i=0;i<n;i++)
//        {
//            sum=0;
//            for(int j=i;j<n;j++)
//            {
//                sum=a[i]+a[j];
//                if(sum==k)
//                {
//                    count++;
//                    System.out.println("a["+i+"] : "+a[i]+"   a["+j+"] : "+a[j]+"   count : "+count);
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}

import java.text.*;
import java.util.Date;
public class DateDemo {

   public static void main(String args[]) {
      // Instantiate a Date object
      Date date = new Date();
    SimpleDateFormat ft=new SimpleDateFormat("YYYY/MM/DD");
      // display time and date using toString()
       
      System.out.println(ft.format(date));
   }
}