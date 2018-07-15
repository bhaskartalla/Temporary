
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class qentry
{
    int v,d;
}
public class SnakenLadder
{    
    
    static int getMinDiceThrows(int moves[], int n)
    {
        boolean visit[]=new boolean[n];
        Queue<qentry> q=new LinkedList<qentry>();
        qentry qe=new qentry();
        qe.v=0;
        qe.d=0;
        visit[0]=true;
        q.add(qe);
        
        while(!q.isEmpty())
        {
            qe=q.remove();
            int ver=qe.v;
            
            if(ver==n-1)
            {
               break;
            }
            
            for(int j=ver+1;j<=ver+6 && j<n;j++)
            {
                if(!visit[j])
                {
                    visit[j]=true;
                    qentry t=new qentry();
                    t.d=qe.d+1;
                    
                    if(moves[j]==-1)
                    {
                        t.v=j;
                    }
                    else
                    {
                        t.v=moves[j];
                    }
                    q.add(t);
                }
            }      
            
        }
        return qe.d;
    }
    public static void main(String[] args)
    {
         int N = 30;
        int moves[] = new int[N];
        for (int i = 0; i < N; i++)
            moves[i] = -1;
 
        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;
 
        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;
        
        System.out.println("Min Dice throws required is " + 
                          getMinDiceThrows(moves, N));
    }

    
}
