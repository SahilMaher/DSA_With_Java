import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CandleCount 
{
    public static int birthdayCakeCandles(List<Integer> candles)
     {
         
        int max1=Collections.max(candles);
        int maxVal=Collections.frequency(candles,max1);


    

        return maxVal;


    

 

    }
    public static void main(String[] args) 
    {
List<Integer> ls=new ArrayList<>();
ls.add(18);
ls.add(90);
ls.add(90);
ls.add(13);
ls.add(90);
ls.add(8);
ls.add(90);
ls.add(43);



        int val=CandleCount.birthdayCakeCandles(ls);
        System.out.println(val);
        
    }
    
}
