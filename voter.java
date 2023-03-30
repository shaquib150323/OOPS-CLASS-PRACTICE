import java.util.*;
class voter
{
    public static void main(String args[])
    {
        int age;
        Scanner sc= new Scanner(System.in);
System.out.println("enter your age\n");
age=sc.nextInt();
if (age>=18)
System.out.println("congrats!!! you are eligible for voting");
else
System.out.println("sorry you are not eligible for voting");

    }
}