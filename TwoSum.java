import java.util.*;
public class TwoSum 
{

      
            Vector<Integer> twoSum(Vector<Integer> nums, int target) 
            {
                Vector<Integer> ans=new Vector<>();
                int len=nums.size();
                for(int i=0; i<len;i++)
                {
                    for(int ii=1;ii<len-1;ii++)
                    {
                    int  add1=nums.get(i)+nums.get(ii);
                        if(add1==target)
                        {
                            ans.add(i);
                            ans.add(ii);
                            break;
        
                        }
                    }
        
                }
                return ans;
                
            }
        
        public static void main(String[] args) 
        {
            Vector<Integer> vt=new Vector<>();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Element number of vector");
            int op=sc.nextInt();
            for(int i=0;i<op;i++)
            {
                System.out.println("Enter Value");
                int val=sc.nextInt();
                vt.add(val);

            }
            System.out.println("Enter Sum Target");
            int target=sc.nextInt();
            TwoSum ysm=new TwoSum();
            Vector<Integer> ans=ysm.twoSum(vt,target);
            System.out.println(ans);
        }
    
}
