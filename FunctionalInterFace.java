
/**
 * InnerFunctionalInterFace
 */
 interface AB 
{
    String getName();
    default String setName()
    {
        return "Hello";

    }

    
}

class A implements AB
{

    
    public String getName() {
        return "Hello";
    }

}
public class FunctionalInterFace 
{
    public static void main(String[] args) 
    {
        AB a=()->
        {
            return "Hello";
        };

        System.out.println(a.getName());
    }
    
}
