public class RevrsNum 
{
    public String getData(String n)
    {
        String Maxres="";
        String res="";
        String MinRes="";
        Boolean b=true;
        int MaxtempVal=Integer.valueOf(n);
        int MintempVal=Integer.valueOf(n);
       
        while(b)
        {
            int maxNum=MaxtempVal;
            int minVal=MintempVal;
            while(maxNum>0)
            {
                int rev=maxNum%10;
                maxNum=maxNum/10;
                Maxres+=String.valueOf(rev);



            }
            while(minVal>0)
            {
                int rev=minVal%10;
                minVal=minVal/10;
                MinRes+=String.valueOf(rev);
                


            }
            if(MaxtempVal<=10)
            {
                res=String.valueOf(--MaxtempVal);
                b=false;

            }
            else if(Maxres.equals(n))
            {
                res=Maxres;
                b=false;
            }
            else
            {
               MaxtempVal ++;

            }
            if(MintempVal<=10)
            {
                res=String.valueOf(--MintempVal);
                b=false;

            }
            else if(MinRes.equals(n))
            {
                res=MinRes;
                b=false;
            }
            else
            {
                MintempVal--;

            }



        }
        return res;
    }
    public static void main(String[] args) 
    {
        RevrsNum r=new RevrsNum();
       String op= r.getData("123");
       System.out.println(op);
        
        
        

  
}
}
