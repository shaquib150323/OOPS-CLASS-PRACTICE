import java.util.*;
class swaplUI   //SWAPPING USING TEMPORARY VARIABLE (LOCAL VARIABLE METHOD and user input)
{
    public static void main(String Shaquib[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("\nenter the value of a & b\n");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("\ninitially a = "+a+" b = "+b+"\n");
        int temp;
        temp= a;
        a=b;
        b=temp;
        System.out.println("after swapping a = "+a+" b = "+b);
    }
}