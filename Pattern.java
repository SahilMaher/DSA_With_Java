public class Pattern 
{
    public static void main(String[] args) 
    {
        for(int i=0;i<10;i++)
        {
            for(int j=20;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int i1=0;i1<i;i1++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
