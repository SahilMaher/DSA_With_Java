public class BinarySearch 
{

    public static int binarySearch(int[] arr,int n)
    {
        int l=0;
        int len=arr.length-1;
      
       while(l<=len)
        {
            int mid=(len+l)/2;
            if(arr[mid]==n)
            {
                return mid;

            }
            else if(arr[mid]>n)
            {
                len=mid-1;
                
            }
            else
            {
                l=mid+1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 6));

        
    }
    
}
