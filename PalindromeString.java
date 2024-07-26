public class PalindromeString 
{
    
public static void main(String[] args)
{
    String str="hello";
    String revstr="";
    int len=str.length();
    for(int i=0;i<len;i++)
    {
      char ch=str.charAt(i);
      revstr=ch+revstr;
    }

    System.out.println(revstr);
}    

}
