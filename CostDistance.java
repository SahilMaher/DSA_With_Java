import java.lang.*;
import java.util.Random;
public class CostDistance 
{
    public static void main(String[] args)
    {
        int[][] arr=new int[5][5];
        for(int i=0;i<5;i++)
        {
            for(int ii=0;ii<5;ii++)
            {
                double d=Math.random();
                int val=(int) (d*10)+4;
                arr[i][ii]=val;
                
            }
        }
        int distance=0;
        int minVal=0;
        for(int i=0;i<5;i++)
        {
            minVal=arr[i][0];
            for(int ii=1;ii<5;ii++)
            {
                if(minVal>arr[i][ii])
                minVal=arr[i][ii];

                System.out.print(arr[i][ii]+"-");
                
               
           
            }
            System.out.println();
           distance+=minVal;
        }
        System.out.println("Total distance is:-"+distance);
        
    }
    
}
