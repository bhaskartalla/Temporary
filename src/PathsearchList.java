import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PathsearchList
{    
    static  int n,e,temp,mat[][];
    static boolean v[],x;
    static LinkedList<Integer>l[];
    static boolean search(int s,int t)
    {
        if(s==t)
        {
            return true;
        }
        v[s]=true;
        Iterator it = l[s].iterator();        
        while(it.hasNext())
        {
            temp=(int)it.next();
            if(!v[temp])
            {
                x=search(temp,t);
                if(x)
                {
                    return true;
                }
            }
        }
        return false;
    }    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the nodes : ");
        n=sc.nextInt(); 
        //System.out.println("Enter the edges : ");
        e=sc.nextInt();
        l=new LinkedList[n+1];
       
        v=new boolean[n+1];
        int s,d;      
        for(int i=1;i<=n;i++)
        {
            l[i]=new LinkedList<>();
        }        
        for(int i=0;i<e;i++)
        {
            s=sc.nextInt();
            d=sc.nextInt();            
            l[s].add(d); 
            l[d].add(s);            
        }          
        s=sc.nextInt();
        d=sc.nextInt();
        System.out.println(search(s,d));    
    }
}


