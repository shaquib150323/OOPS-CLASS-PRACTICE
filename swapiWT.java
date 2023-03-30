class swapiWT                     //SWAPPING WITHOUT TEMPORARY VARIABLE (INSTANCE VARIABLE METHOD)
{
    int a=20,b=30;
    public static void main(String Shaquib[])
    {
        swapi obj= new swapi();
        System.out.println("initially a = "+obj.a+" b = "+obj.b);
        obj.a=obj.a-obj.b;         // main logic
        obj.b=obj.a+obj.b;
        obj.a=obj.b-obj.a;
        System.out.println("after swaping a = "+obj.a+" b = "+obj.b);
    }
}