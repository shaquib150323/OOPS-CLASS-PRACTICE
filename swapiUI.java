import java.util.*;
class swapiUI                      //SWAPPING USING TEMPORARY VARIABLE (INSTANCE VARIABLE METHOD)
{
    int a,b;
    public static void main(String Shaquib[])
    {
        Scanner sc = new Scanner(System.in);
        swapiUI obj = new swapiUI();
        System.out.println("\nenter the value of a & b\n");
        obj.a =sc.nextInt();
        obj.b =sc.nextInt();
        System.out.println("initially a = "+obj.a+" b = "+obj.b);
        int temp;
        temp= obj.a;
        obj.a=obj.b;
        obj.b=temp;
        System.out.println("after swaping a = "+obj.a+" b = "+obj.b);
    }
}