public class LinearSearch
{
    public static int lSearch(int[] arr,int n)
    {
       int len=arr.length;
       for(int i=0;i<len;i++)
       {
        if(n==arr[i])
        {
            return i;
        }
       }
        return 0;
    }
    public static void main(String[] args) 
    {
        int[] arr={2,1,3,4,5,1,7};
        int n=2;
        System.out.println(lSearch(arr, n));
        
        
    }
    
}
