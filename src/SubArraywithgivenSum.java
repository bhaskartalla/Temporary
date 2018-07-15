
import java.util.Scanner;
public class SubArraywithgivenSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        } 
        
/*---------------------------------O(n*n)-------------------------------------*/  
        
//        int cal;
//        L1:
//        for(int i=0;i<n;i++)
//        {
//            cal=0;
//            for(int j=i;j<n;j++)
//            {
//                cal+=a[j];
//                if(cal==sum)
//                {
//                    System.out.println("i : "+i+"   j : "+j);
//                    break L1;
//                }
//            }
//        }
        
        
        int st=0,curs=a[st];
        for(int i=1;i<n;i++)
        {
            while(curs>sum && st<i-1)
            {
                curs-=a[st];
                st++;
            }           
            if(curs==sum)
            {
                System.out.println("i : "+st+"   j : "+(i-1));
                break;
            }
            if(i<n)
            {
                curs+=a[i];
            }
        }            
    }
}


