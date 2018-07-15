
import java.util.Scanner;

public class ActivitySelection
{
    static int selectActivity(int s[],int f[],int n)
    {
        int ca=0,count=1;
        System.out.println("start : "+s[ca]+"    finish : "+f[ca]);
        
        for(int nx=ca+1;nx<n;nx++)
        {
            if(f[ca]<=s[nx])
            {
                count++;                
                ca=nx;
                System.out.println("start : "+s[ca]+"    finish : "+f[ca]);
            }
        }
        return count;      
    }

//    // A O(n^2) time and O(1) extra space function for Pascal's Triangle
//    static void printPascal(int n)
//    {
//      for (int line = 1; line <= n; line++)
//      {
//        int C = 1;  // used to represent C(line, i)
//        for (int i = 1; i <= line; i++)  
//        {
//            System.out.print(C);  // The first value in a line is always 1
//            C = C * (line - i) / i;  
//        }
//          System.out.println();
//      }
//    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s[] = new int[n];
        int f[] = new int[n];
        int t=0;
        for (int i = 0; i < n; i++)
        {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            f[i] = sc.nextInt();
        }
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(f[j]>f[j+1])
                {
                    t=f[j+1];
                    f[j+1]=f[j];
                    f[j]=t;
                    t=s[j+1];
                    s[j+1]=s[j];
                    s[j]=t;
                    
                }       
            }
        }
        
    }
}
