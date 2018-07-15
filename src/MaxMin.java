
import java.util.Scanner;

class mxmi
{
    int max,min;
}
public class MaxMin
{
    static int comp=0;
    static mxmi getMaxMin1(int a[],int s,int e)
    {
        mxmi mm=new mxmi();
        if(s==e)
        {
            mm.max=a[s];
            mm.min=a[e];            
            return mm;
        }
        if(s==e-1)
        {
            if(a[s]>a[e])
            {
                mm.max=a[s];
                mm.min=a[e]; 
            }
            else
            {
                mm.max=a[e];
                mm.min=a[s]; 
            }
            comp++;
            return mm;
        }        
        mxmi l=getMaxMin1(a,s,s+1);
        mxmi r=getMaxMin1(a,s+2,e);
        
        if(l.max>r.max)
        {
            mm.max=l.max;             
        }
        else
        {
            mm.max=r.max;            
        }
        if(l.min>r.min)
        {
            mm.min=r.min;             
        }
        else
        {
            mm.min=l.min;            
        }    
        comp+=2;
        return mm;
    }    
    
    static mxmi getMaxMin2(int a[],int s,int e)
    {
        mxmi mm=new mxmi();
        if(s==e)
        {
            mm.max=a[s];
            mm.min=a[e];            
            return mm;
        }
        if(s==e-1)
        {
            if(a[s]>a[e])
            {
                mm.max=a[s];
                mm.min=a[e]; 
            }
            else
            {
                mm.max=a[e];
                mm.min=a[s]; 
            }
            comp++;
            return mm;
        }        
        int m=(s+e)/2;
        mxmi l=getMaxMin2(a,s,m);
        mxmi r=getMaxMin2(a,m+1,e);
        
        if(l.max>r.max)
        {
            mm.max=l.max;           
        }
        else
        {
            mm.max=r.max;
        }
        if(l.min>r.min)
        {
            mm.min=r.min;           
        }
        else
        {
            mm.min=l.min;
        }     
        comp+=2;
        return mm;
    }    
    
    
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=12;//sc.nextInt();
        int a[]={2,3,43,3,4,3,5,4,6,1,8,4,5,4,1,8,5,4,2,41,8,6,54,515,321,654,16,654,34,1,654,13,354,6,6,4,3,3,4,1,2,3,4,5,6,7,6,5,5,4,2,7,9,8,7,1,2,3,4,5,6};  //new int[n];
           
//        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        
        mxmi mm1=getMaxMin1(a,0,a.length-1);
        System.out.println(mm1.max);
        System.out.println(mm1.min);   
        System.out.println("Comparisions 1 : "+comp);
        comp=0;
        mxmi mm2=getMaxMin2(a,0,a.length-1);
        System.out.println(mm2.max);
        System.out.println(mm2.min);   
        System.out.println("Comparisions 2 : "+comp);
    }
}
