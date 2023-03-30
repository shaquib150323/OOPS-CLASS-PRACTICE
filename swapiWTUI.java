import java.util.*;   //SWAPPING WITHOUT TEMPORARY VARIABLE (INSTANCE VARIABLE) USER INPUT
class swapiWTUI
{
    int a,b;
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        swapiWTUI obj= new swapiWTUI();
        System.out.println("enter the value of a and b");
        obj.a=sc.nextInt();
        obj.b=sc.nextInt();
        System.out.println("initially a = "+obj.a+" b = "+obj.b);
        obj.a=obj.a-obj.b;         // main logic
        obj.b=obj.a+obj.b;
        obj.a=obj.b-obj.a;
        System.out.println("after swapping a = "+obj.a+" and b = "+obj.b);
    }
}