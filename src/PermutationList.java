

import java.util.Scanner;

public class PermutationList
{
    static void printPermutation(String s,int n,int r,String sa)
    {
        if(r==0)
        {
            System.out.println(sa);
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                sa+=s.charAt(i);
                printPermutation((s.substring(0,i)+s.substring(i+1,s.length())),n-1,r-1,sa);
                sa=sa.substring(0,sa.length()-1);
            }
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int r=sc.nextInt(); 
        String sa="";
        printPermutation(s,s.length(),r,sa);
    }
}
