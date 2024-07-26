public class StringPalindrome 
{
    public static void main(String[] args) {
        String s1="Hello";
   
        int s1len=s1.length();
        String revstr="";
      
        for(int i=s1len;i>0;i--)
        {
            char ch=s1.charAt(i-1);
            revstr+=ch;

            
        }
        System.out.println(revstr);
    }
    
}
