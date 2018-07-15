
import java.util.Scanner;

public class TowersOfHannoi
{    
    static void printSteps(int n,char A,char B,char C)
    {
        if(n==1)
        {
            System.out.println(A+" to "+B);
        }
        else
        {
            printSteps(n-1,A,C,B);
            System.out.println(A+" to "+B);
            printSteps(n-1,C,B,A);
        }        
    }     
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=15;//sc.nextInt();
        printSteps(n,'A','B','C');        
    }
}
