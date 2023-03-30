import java.util.*;
class switchcase
{
    public static void main(String shaquib[])
    {
        char ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your gender\n M for male\n F for female");
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'M':
            System.out.println("you selected male as your gender");
            break;
            case 'F':
            System.out.println("you selected female as your gender");
            break;
            default:
            System.out.println("you selected others as your gender");
        }
    
    }
}