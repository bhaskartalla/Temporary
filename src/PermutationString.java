
import java.util.Scanner;


public class PermutationString
{
    static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
    static void permute(String s,int i,int j)
    {
        if(i==j)
        {
            System.out.println(s);
        }
        else
        {
            for(int x=i;x<=j;x++)
            {
                s = swap(s,x,i);
                permute(s,i+1,j);
                s = swap(s,x,i);
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        permute(s,0,s.length()-1);
    }
}
