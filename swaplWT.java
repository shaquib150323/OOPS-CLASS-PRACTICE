class swaplWT               //SWAPPING WITHOUT TEMPORARY VARIABLE (LOCAL VARIABLE METHOD)
{
    public static void main(String Shaquib[])
    {
        int a=20,b=30;
        System.out.println("initially a = "+a+" b = "+b);
        a=a-b;         // main logic
        b=a+b;
        a=b-a;
        System.out.println("after swaping a = "+a+" b = "+b);
    }
}