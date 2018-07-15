
import java.util.Scanner;


public class MaxChars
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt(),x=0,c=0;
        int a[]=new int[10];
        int max=0;
        
        for(int i=0;i<n;i++)
        {
            x=sc.nextInt();
            a[x]++;
            if(max<a[x])
            {
                max=a[x];
                c=x;               
            }
        }
        System.out.println("count : "+max+"   Number : "+c);
        
    }
}