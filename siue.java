import java.util.*;
class siue                        // SIMPLE INTEREST CALCULATOR
{
    public static void main(String Shaquib[])
    {
        double p,r,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a simple interest calculator\n");
        System.out.println("enter the principle amount\n");
        p=sc.nextDouble();
        System.out.println("enter the rate of interest\n");
        r=sc.nextDouble();
        System.out.println("enter the time period\n");
        t=sc.nextDouble();
        double si= (p*r*t)/100;
        System.out.println("simple interest is "+si+" rupees\n");
    }
}