import java.util.*;
class ciue                        // COMPOUND INTEREST CALCULATOR
{
    public static void main(String Shaquib[])
    {
        double p,r,t,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("This is a compound interest calculator\n");
        System.out.println("enter the principle amount\n");
        p=sc.nextDouble();
        System.out.println("enter the rate of interest in percentage\n");
        r=sc.nextDouble();
        System.out.println("enter the time period\n");
        t=sc.nextDouble();
        System.out.println("enter the compounding frequency\n");
        n=sc.nextDouble();
        r=r/100;                   // converting percent into decimal
        double A= p * Math.pow((1+(r/n)),n*t);
        double ci= A-p;
        System.out.println("final amount is "+A+" rupees\n");
        System.out.println("compound interest is "+ci+" rupees\n");
    }
}