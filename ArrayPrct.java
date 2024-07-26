public class ArrayPrct 
{
    public static void main(String[] ags)
    {
        int[][] arr={{1,2,3,4},{4,3,2,1},{5,4,3,2},{1,2,1,2}};
        int len=arr.length;
        for(int i=0;i<len;i++)
        {
            for(int ii=0;ii<len;ii++)
            {
                
                if(ii==0 || i==len  )
                {
                    System.out.println(arr[i][ii]);

                }

            }
        }
    }
    
}
