class swapi                      //SWAPPING USING TEMPORARY VARIABLE (INSTANCE VARIABLE METHOD)
{
    int a=20,b=30;
    public static void main(String Shaquib[])
    {
        swapi obj= new swapi();
        System.out.println("initially a = "+obj.a+" b = "+obj.b);
        int temp;
        temp= obj.a;
        obj.a=obj.b;
        obj.b=temp;
        System.out.println("after swaping a = "+obj.a+" b = "+obj.b);
    }
}