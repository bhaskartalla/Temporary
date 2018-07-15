
import java.util.Scanner;

class Result
{
    boolean pf=false;
    int cost=Integer.MAX_VALUE;
}
public class Stamps
{
    static int count=0;
    static int best=Integer.MAX_VALUE;
    
    static Result getStamps1(int l[],int start,int c, int n)
    {
        count++;
        Result r=new Result();
        if(c==0)
        {
            r.pf=true;
            r.cost=n;
            return r;
        }
        else if(c<0 || start==l.length)
        {
            r.pf=false;
            r.cost=-1;     
            return r;
        }
        else
        {
            Result r1=getStamps1(l,start+1,c-l[start],n+1);
            Result r2=getStamps1(l,start+1,c,n);
            
            if(r1.pf==false && r2.pf==false)
            {
                r.pf=false;
                r.cost=-1;
            }
            else if(r1.pf==true && r2.pf==false)
            {
                r.pf=true;
                r.cost=r1.cost;
            }
            else if(r1.pf==false && r2.pf==true)
            {
                r.pf=true;
                r.cost=r2.cost;
            }
            else
            {
                r.pf=true;
                r.cost=Math.min(r1.cost, r2.cost);                
            }
            return r;
        }
    }
    
    
    static Result getStamps2(int l[],int start,int c, int n)
    {
        count++;
        Result r=new Result();
        if(c==0)
        {
            r.pf=true;
            r.cost=n;
            best=Math.min(best, n);
            return r;
        }
        else if(c<0 || start==l.length || n+1>=best)
        {
            r.pf=false;
            r.cost=-1;     
            return r;
        }
        else
        {
            Result r1=getStamps2(l,start+1,c-l[start],n+1);
            Result r2=getStamps2(l,start+1,c,n);
            
            if(r1.pf==false && r2.pf==false)
            {
                r.pf=false;
                r.cost=-1;
            }
            else if(r1.pf==true && r2.pf==false)
            {
                r.pf=true;
                r.cost=r1.cost;
            }
            else if(r1.pf==false && r2.pf==true)
            {
                r.pf=true;
                r.cost=r2.cost;
            }
            else
            {
                r.pf=true;
                r.cost=Math.min(r1.cost, r2.cost);                
            }
            return r;
        }
    }    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=9;//sc.nextInt();
        //int a[]={6,5,4,3,2,1};//new int[];
       int a[]={2,3,43,3,4,3,5,4,6,1,8,4,5,4,1,8,5,4,2,41,8,6,54,515,321,654,16,654,34,1,654,13,354,6,6,4,3,3,4,1,2,3,4,5,6,7,6,5,5,4,2,7,9,8,7,1,2,3,4,5,6};  //new int[n];
        
        
        int c=21;//sc.nextInt();
        
        //for(int i=0;i<n;i++)a[i]=sc.nextInt();
        
        Result r1=getStamps1(a,0,c,0);
        System.out.println(r1.cost);
        System.out.println("calls without pruning: "+count);
        count=0;
        Result r2=getStamps2(a,0,c,0);
        System.out.println(r2.cost);
        System.out.println("calls with pruning: "+count);
    }
}


