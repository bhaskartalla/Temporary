
import java.util.Scanner;

public class LongestPalindromicSubsequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int l=s.length();
        int mat[][]=new int[l+1][l+1];
        
        for(int k=0;k<l;k++)
        {
            for(int i=0;i<l-k;i++)
            {
                if(k==0)
                {
                    mat[i][i+k]=1;
                }
                else if(s.charAt(i)==s.charAt(i+k))
                {
                    mat[i][i+k]=mat[i+1][i+k-1]+2;
                }
                else
                {
                    mat[i][i+k]=Math.max(mat[i][i+k-1], mat[i+1][i+k]);
                }
            }
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        int j=l-1;
        String ps="";
        
        for(int i=0;i<mat[0][l-1];i++)
        {
            if(mat[i+1][j-1]+2==mat[i][j])
            {
                ps+=s.charAt(i);
                i++;
                j--;
            }
            else if(mat[i][j]==mat[i+1][j])
            {
                i++;
            }
            else if(mat[i][j]==mat[i][j-1])
            {
                j--;
            }
        }        
        if(mat[0][l-1]%2!=0)
        {           
            System.out.println(ps+(new StringBuffer(ps.substring(0, ps.length()-1))).reverse());            
        }
        else
        {
            System.out.println(ps+(new StringBuffer(ps.substring(0))).reverse());
        }
        
        
    }
}
