import java.util.Scanner;

public class SumUsingChar 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String");
        String s=sc.nextLine().toLowerCase();
        sc.nextLine();
        int len=s.length();
        char firstLatter='a';
        int lSum=0;
        int rSum=0;
        if(len%2!=0)
        {
            System.out.println(0);

        }
        else{
            int lenDivid=len/2;
        for (int i=1;i<=26;i++)
        {
            for(int j=0;j<lenDivid;j++)
            {

            char tempChar=s.charAt(j);
           if(firstLatter==tempChar)
           {
            lSum+=i;

           }
            }
            for(int ii=lenDivid;ii<len;ii++)
            {
                char tempChar=s.charAt(ii);
                if(firstLatter==tempChar)
                {
                    rSum+=i;
                }
                

            }

        }
        if(lSum==rSum)
        {
            System.out.println(1);

        }
        else
        {
            System.out.println(0);
        }


    } 

    }
    
}
