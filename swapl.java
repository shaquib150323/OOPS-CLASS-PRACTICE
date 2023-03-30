class swapl               //SWAPPING USING TEMPORARY VARIABLE (LOCAL VARIABLE METHOD)
{
    public static void main(String Shaquib[])
    {
        int a=20,b=30;
        System.out.println("initially a = "+a+" b = "+b);
        int temp;
        temp= a;
        a=b;
        b=temp;
        System.out.println("after swaping a = "+a+" b = "+b);
    }
}