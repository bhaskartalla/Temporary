import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);        
        while(true)
        {
            int n=sc.nextInt();
            if(n==0)
            {
                break;
            }
            else
            {
                String  s=Integer.toString(n);
                int a[]=new int[s.length()];
                a[0]=1;
                if(s.length()>1)
                {
                    a[1]=((s.charAt(1)-48)>0 && ((s.charAt(0)-48)*10+(s.charAt(1)-48))<=26)?2:1;
                    for(int i=2;i<s.length();i++)
                    {
                        if((s.charAt(1)-48)>0 && ((s.charAt(0)-48)*10+(s.charAt(1)-48))<=26)
                        {
                            a[i]=a[i-1]+a[i-2];
                        }
                        else
                        {
                            a[i]=a[i-1];
                        }
                    } 
                }                              
                System.out.println(a[s.length()-1]);               
            }            
        }        
    }    
}


