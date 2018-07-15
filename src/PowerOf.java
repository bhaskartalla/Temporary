
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author talla
 */
public class PowerOf
{  
    static long pow(long x,long y)
    {
 /*--------------------    O(y) Time Complexity     --------------------------*/    
        
//        long pw=x;        
//        for(int i=0;i<y-1;i++)
//        {
//            pw*=x;
//        }  
//        return pw;

 /*--------------------    O(y) Time Complexity     --------------------------*/    
  
//        if(y==1)
//        {
//            return x;
//        }       
//        return x*pow(x,y-1);
   
 /*--------------------    O(Log y) Time Complexity  -------------------------*/    
         
        if (y == 0)
        {
            return 1;
        }       
        long temp=pow(x,y/2);
        
        if (y%2 == 0)
        {
            return temp*temp;
        }        
        else
        {
            return x*temp*temp;      
        }    
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long x=sc.nextInt();
        long y=sc.nextInt();
        System.out.println(pow(x,y));
    }
}

