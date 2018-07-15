
import java.util.Scanner;


public class SpiralMatrix
{
  
  static int[] spiralCopy(int[][] inputMatrix) {
    
    
        int i=0,p=0,q=inputMatrix[0].length,r=inputMatrix.length,s=0,x=0;
        int ans[]=new int[q*r];
        while(p<r && s<q)
        {
            for(i=s;i<q;i++)
            {
                //System.out.println(inputMatrix[p][i]+" ");
              ans[x++]=inputMatrix[p][i];
            }
            p++;
            
            for(i=p;i<r;i++)
            {
                //System.out.println(inputMatrix[i][q-1]+" ");
              ans[x++]=inputMatrix[i][q-1];
            }
            q--;
            if(p < r)
            {
                for(i=q-1;i>=s;i--)
                {
                    //System.out.println(inputMatrix[r-1][i]+" ");
                  ans[x++]=inputMatrix[r-1][i];
                }
                r--;
            }
               
            if(s<p)
            {
                for(i=r-1;i>=p;i--)
                {
                    //System.out.println(inputMatrix[i][s]+" ");
                  ans[x++]=inputMatrix[i][s];
                }
                s++; 
            }                 
        }
return ans;
  }

    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        
        int ans[]=spiralCopy(mat);  
        
         for(int j=0;j<ans.length;j++)
        {
            System.out.println(ans[j]);
        }
    }
}


//4
//5
//1 2 3 4 5
//6 7 8 9 10
//11 12 13 14 15
//16 17 18 19 20