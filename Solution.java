import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) 
    {
        int len =arr.size();
        int negative=0;
        int positive=0;
        int zer=0;
        for(int i=0;i<len;i++)
        {
            int val=arr.get(i);
            if(val>0)
            {
                positive++;
            }
            else if(val<0)
            {
                negative++;
            }
            else
            {
                zer++;
                
            }
          
            
        }
        double p=(double) positive/len;
        double n=(double) negative/len;
        double z=(double)  zer/len;
          System.out.println(p);
                
                      System.out.println(n);
                      System.out.println(z);


    }

}

public class Solution {
    public static void main(String[] args) 
    {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(-2);
        arr.add(-3);
        arr.add(4);
        arr.add(0);




     

        Result.plusMinus(arr);

  
    }
}
