class InheritanceExmpl
{
   static int i=0;
    InheritanceExmpl()
    {
        i++;

    }
    public static void main(String[] args)
     
    {
        InheritanceExmpl a=new InheritanceExmpl();
        InheritanceExmpl b=new InheritanceExmpl();
        InheritanceExmpl c=new InheritanceExmpl();
        InheritanceExmpl d=new InheritanceExmpl();

        System.out.println(InheritanceExmpl.i);
        
    }
}