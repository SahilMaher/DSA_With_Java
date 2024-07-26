public class SliceString {

    public static void main(String[] args) {
        String str="sahil modhavadiya";
        int len=str.length();
        
        char ch;
        char [] arr=new char[len];
        for(int i=0;i<len;i++)
        {
            ch=str.charAt(i);
            
            if(i==0)
            {
                
                ch=Character.toUpperCase(ch);
                arr[i]=ch;
            }
            else if(str.charAt(i-1)== ' ' )
            {
                ch=Character.toUpperCase(ch);
                arr[i]=ch;


            }
            else
            {
                arr[i]=ch;
            }
        

        }
        String str3=new String(arr);
        System.out.println(str3);
    }
}