// TERNARY OPERATOR IN JAVA
import java.util.*;

class ternaryvoter {
    public static void main(String args[])

    {
        Scanner sf = new Scanner(System.in);
        int age;
        System.out.println("enter your age");
        age = sf.nextInt();
        // age=(age>=18)?System.out.println("eligible"):System.out.println("not
        // eligible");
        String result = (age >= 18 ) ? "eligible for voting" : "not eligible for voting";
        System.out.println(result);

    }
}