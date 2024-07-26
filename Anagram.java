import java.util.Arrays;

public class Anagram 
{
    
    public static void main(String[] args) 
    {
        String str1="Hello";
        String str2="ollHe";
        int len1=str1.length();
        int len2=str2.length();
        char[] arr1=new char[len1];
        char[] arr2=new char[len2];
        if(len1!=len2)
        {
            System.out.println("False");
        }
        else{
        for(int i=0;i<len1;i++)
        {
            arr1[i]=str1.charAt(i);
            arr2[i]=str2.charAt(i);

        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sizex=0;
        for (int i=0;i<len1;i++)
        {
            if(arr1[i]==arr2[i])
            {
                sizex++;

            }
            else
            {
                break;
            }
        }
        if(len1!=sizex)
        {
            System.out.println("false");
            
        }
        else
        {
            System.out.println("True");
        }


        
    }

        
    }


    
}
