
import java.util.Scanner;


public class PatternMatching
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String t=sc.nextLine();
        String p=sc.next();
        int n=t.length();
        int m=p.length();
       
        
/********************Naive Approach********************************************/
        
        
        for(int i=0;i<=(n-m);i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(t.charAt(i+j)!=p.charAt(j))
                {
                    break;
                }
            }            
            if(j==m)
            {
                System.out.println(i);
                break;
            }
        }
        
        
        for(int s=-1;s<(n-m);s++)
        {
            if(p.equals(t.substring(s+1, s+m+1)))
            {
                System.out.println(s+1);
                break;
            }
        }
        
  
/********************KMP Algorithm********************************************/
        
//        
//        int z[]=new int[m];
//        
//        for(int i=1,j=0;i<m;i++)
//        {
//            if(p.charAt(i)==p.charAt(j))
//            {
//                z[i]=++j;
//            }
//            else
//            {
//                if(j!=0)
//                {
//                    j=z[j-1];
//                    i--;
//                }
//                else
//                {
//                    z[i]=0;
//                }
//            }
//        } 
//        
//        for(int i=0,j=0;i<n;)
//        {
//            if(t.charAt(i)==p.charAt(j))
//            {
//                i++;
//                j++;
//            }
//            else
//            {
//                if(j!=0)
//                {
//                    j=z[j-1];
//                }
//                else
//                {
//                    i++;
//                }
//            }
//            if(j==m)
//            {
//                System.out.println(i-m);
//                break;
//            }
//        }
    }        
}

