//find the duplicate value in java
import java.util.*;
import java.util.Scanner;

class Contain_Dup
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Length Of Array max Length is 20");
        int len=sc.nextInt();
        int[] arr=new int[len];
        for (int i=0;i<len;i++)
        {
            System.out.println("Enter Value "+i+":-");
            arr[i]=sc.nextInt();
        }
        Set<Integer> hasarr=new HashSet<>();
        for(int num:arr)
        {
            hasarr.add(num);
        }
        int sizes=hasarr.size();
        int[] newarr=new int[sizes];
        int indx=0;
        for(int num:hasarr)
        {
            newarr[indx++]=num;

        }

System.err.println(Arrays.toString(newarr));
   
    }
}