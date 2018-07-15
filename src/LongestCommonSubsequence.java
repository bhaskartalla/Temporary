

import java.util.Scanner;

public class LongestCommonSubsequence
{ 
    static int sub[];

    static void LCS(int a[],int b[])
    {
        int n=a.length;
        int m=b.length;        
        int mat[][]=new int[n+1][m+1];
        
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0 || j==0)
                {
                    mat[i][j]=0;
                }
                else if(a[i-1]==b[j-1])
                {
                    mat[i][j]=mat[i-1][j-1]+1;
                }
                else 
                {
                    mat[i][j]=Math.max(mat[i-1][j],mat[i][j-1]);
                }
            }
        }        
        int i=n,j=m,x=0;
        sub=new int[mat[n][m]];
        while(i>0 && j>0)
        {
            if(a[i-1]==b[j-1])
            {
                sub[x]=a[i-1];
                i--;
                j--;
                x++;
            }
            else if(mat[i-1][j]>mat[i][j-1])
            {
                i--;
            }
            else
            {
                j--;
            }
        }     
    } 
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);        
        int n=sc.nextInt();
        int m=sc.nextInt();        
        int na[]=new int[n];
        int ma[]=new int[m];        
        for(int i=0;i<n;i++)
        {
            na[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            ma[i]=sc.nextInt();
        }        
        LCS(na,ma);        
        for(int i=sub.length-1;i>=0;i--)
        {
            System.out.print(sub[i]+" ");
        }            
    }  
}
