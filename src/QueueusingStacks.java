
import java.util.Scanner;
import java.util.Stack;

public class QueueusingStacks<T>
{
   static Stack s1=new Stack();
   static Stack s2=new Stack();
       
    static void enqueue(int x)
    {
        s1.push(x);
    }
    
    static int dequeue()
    {
        if(s1.isEmpty() && s2.isEmpty())
        {
            return -1; 
        }
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }        
        return (int)s2.pop();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("");
        
        enqueue(1);
        enqueue(2);
        enqueue(3);
        System.out.println(dequeue());
        System.out.println(dequeue());
        enqueue(4);
        enqueue(5);
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());
        System.out.println(dequeue());        
    }
}
