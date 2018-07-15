
import java.util.Scanner;

//led

public class LEDChanges
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int count=0,val=0,prev=0;
        int led[]={6,2,5,5,3,5,6,3,7,6};
        for(int i=0;i<s.length();i++)
        {
            val=led[s.charAt(i)-48];            
            count+=Math.abs(val-prev);
            prev=val;
        }
        System.out.println(count);
    }
        
}
