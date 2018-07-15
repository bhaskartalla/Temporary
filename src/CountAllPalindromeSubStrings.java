import java.util.Scanner;
public class CountAllPalindromeSubStrings
{
    public static void main(String[] args)
    {
        //System.out.println("bhaskar".substring(0,6));
        
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String a,b;
        StringBuffer sb;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                sb=new StringBuffer(s.substring(i,j+1));               
                a=new String(sb);
                b=new String(sb.reverse());             
                
                if(a.equals(b))
                {                    
                    count++;
                    //System.out.println("String : "+a+"  Count : "+count);
                }                
            }
        }
        System.out.println(count);
    }
}
