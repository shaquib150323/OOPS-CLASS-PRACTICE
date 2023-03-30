import java.util.*;
class swaplWTUI     //SWAPPING WITHOUT TEMPORARY VARIABLE (LOCAL VARIABLE METHOD) USER INPUT
{
    public static void main(String Shaquib[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("initially a = "+a+" b = "+b);
        a=a-b;         // main logic
        b=a+b;
        a=b-a;
        System.out.println("after swaping a = "+a+" b = "+b);
    }
}