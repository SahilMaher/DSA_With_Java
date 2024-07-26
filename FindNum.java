//Finding missing number from the unsorted list

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class FindNum 
{
   
    public static void main(String[] args) 
    {
        int[] arr={1,2,3,4,6,7,8,10};
        Arrays.sort(arr);
        int max=arr.length-1;

        int len=arr[max]-1;
        System.out.println(len);
        Vector<Integer> v=new Vector<>();
        for(int i=0;i<max+1;i++)
        {
            v.add(arr[i]);

        }
      

        for(int i=1;i<len;i++)
        {
            
            if(!v.contains(i))
            {
                System.out.println(i);
            }
        }
        
    }
    
}
