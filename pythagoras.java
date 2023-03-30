import java.util.*;
class pythagoras                 // PYHAGORAS' THEOREM
{
    public static void main(String Shaquib[])
    {
        double b,a;             // variable for base and altitude
        Scanner sc = new Scanner(System.in);
        System.out.println("This program calculates hypoteneus by pythagoras' theorem\n");
        System.out.println("enter the length of base\n");
        b=sc.nextDouble();
        System.out.println("enter the length of altitude\n");
        a=sc.nextDouble();
        double h= Math.sqrt(Math.pow(b,2) + Math.pow(a,2));
        System.out.println("hypoteneus of triangle is "+h+" units");
    }
}